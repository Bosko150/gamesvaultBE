package francescocossu.gamevault.controllers;

import francescocossu.gamevault.entities.Cart;
import francescocossu.gamevault.entities.Game;
import francescocossu.gamevault.services.CartService;
import francescocossu.gamevault.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/cart")
public class CartController {

    @Autowired
    private CartService cartService;
    @Autowired
    private GameService gameService;

    @GetMapping("/{cartId}")
    public List<Game> getCartGames(@PathVariable UUID cartId) {

        return cartService.getCartGames(cartId);
    }

    @GetMapping("/user/{userId}")
    public Optional<Cart> findCartByUserId(@PathVariable UUID userId) {

        return cartService.findCartByUserId(userId);
    }

    @DeleteMapping("/delete/{cartId}/{gameId}")
    public void deleteGameFromCart(@PathVariable UUID cartId, @PathVariable UUID gameId) {


        cartService.removeGameFromCart(cartId, gameId);

    }

    @PostMapping("/add/{cartId}/{gameId}")
    public void addGameToCart(@PathVariable UUID cartId, @PathVariable UUID gameId) {
        cartService.addGameToCart(cartId, gameId);
    }

}


