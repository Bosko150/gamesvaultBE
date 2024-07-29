package francescocossu.gamevault.controllers;

import francescocossu.gamevault.entities.Game;
import francescocossu.gamevault.entities.Genre;
import francescocossu.gamevault.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
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

   /* @GetMapping("/search")
    public List<Game> findByTitleContaining(@RequestParam String title) {
        return gameService.findByTitleContaining(title);
    }*/

    @GetMapping("/search")
    public List<Game> filterGames(@RequestParam(required = false) String title,
                                  @RequestParam(required = false) String genre,
                                  @RequestParam(required = false) String orderBy,
                                  @RequestParam(required = false) Double minPrice,
                                  @RequestParam(required = false) Double maxPrice) {
        return gameService.filterGames(title, genre, orderBy, minPrice, maxPrice);
    }

    @GetMapping("/genres")
    public Genre[] getGenres() {
        return Genre.values();
    }


}
