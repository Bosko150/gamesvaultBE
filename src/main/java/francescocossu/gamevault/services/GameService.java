package francescocossu.gamevault.services;

import francescocossu.gamevault.entities.Game;
import francescocossu.gamevault.entities.Genre;
import francescocossu.gamevault.exceptions.NotFoundException;
import francescocossu.gamevault.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public void saveGame(Game game) {

        if (!gameRepository.existsByTitle(game.getTitle())) {
            gameRepository.save(game);
        } else {
            System.out.println("Game already exists " + "-- " + game.getTitle().toUpperCase());
        }

    }

    public void deleteGame(Game game) {
        gameRepository.delete(game);
    }

    public List<Game> getAllGames() {
        return gameRepository.findAll();
    }

    public Game findById(UUID id) {
        return gameRepository.findById(id).orElseThrow(() -> new NotFoundException(id));
    }

    public Optional<Game> findByTitle(String title) {
        return gameRepository.findByTitle(title);
    }

    public List<Game> findGamesByGenres(List<Genre> genres) {
        return gameRepository.findByGenresIn(genres);
    }

    public Optional<Game> findByDeveloper(String developer) {
        return gameRepository.findByDeveloper(developer);
    }

    public Optional<Game> findByPublisher(String publisher) {
        return gameRepository.findByPublisher(publisher);
    }

    public List<Game> findByTitleContaining(String title) {
        return gameRepository.findByTitleContainingIgnoreCase(title);
    }

    public List<Game> filterGames(String title, String genreString, String orderBy, Double minPrice, Double maxPrice) {
        Genre genre = null;
        if (genreString != null && !genreString.isEmpty()) {
            try {
                genre = Genre.valueOf(genreString.toUpperCase());
            } catch (IllegalArgumentException e) {
            }
        }
        return gameRepository.filterGames(title, genre, orderBy, minPrice, maxPrice);
    }
}
