package francescocossu.gamevault.controllers;

import francescocossu.gamevault.entities.Game;
import francescocossu.gamevault.entities.Genre;
import francescocossu.gamevault.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<Game> getAllGames() {
        return gameService.getAllGames();
    }

    @GetMapping("/{id}")
    public Game findById(@PathVariable UUID id) {
        return gameService.findById(id);
    }

    @GetMapping("/search/{title}")
    public Optional<Game> findByTitle(@PathVariable String title) {
        return gameService.findByTitle(title);
    }

    @GetMapping("/genres")
    public Genre[] getGenres() {
        return Genre.values();
    }


}
