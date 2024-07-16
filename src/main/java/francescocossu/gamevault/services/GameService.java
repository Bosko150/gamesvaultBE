package francescocossu.gamevault.services;

import francescocossu.gamevault.entities.Game;
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
            throw new IllegalArgumentException("Game already exists:" + game.getTitle());
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

    public Optional<Game> findByGenre(String[] genres) {
        return gameRepository.findByGenre(genres);
    }
}
