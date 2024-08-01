package francescocossu.gamevault.services;


import francescocossu.gamevault.entities.Cart;
import francescocossu.gamevault.entities.Game;
import francescocossu.gamevault.entities.User;
import francescocossu.gamevault.exceptions.NotFoundException;
import francescocossu.gamevault.repositories.CartRepository;
import francescocossu.gamevault.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class CartService {

    @Autowired
    private CartRepository cartRepository;
    @Autowired
    private UserService userService;
    @Autowired
    private GameService gameService;
    @Autowired
    private GameRepository gameRepository;

    public void saveCart(String userEmail) {

        Cart cart = new Cart();
        User user = userService.findByEmail(userEmail);
        cart.setUser(user);
        cartRepository.save(cart);

    }

    public Optional<Cart> findById(UUID id) {
        return cartRepository.findById(id);
    }

    public Optional<Cart> findCartByUserId(UUID userId) {
        return cartRepository.findByUserId(userId);
    }

    public void addGameToCart(UUID cartId, UUID gameId) {
        Cart cart = cartRepository.findById(cartId).orElseThrow(() -> new NotFoundException(cartId));
        cart.getGames().add(gameRepository.findById(gameId).orElseThrow(() -> new NotFoundException(gameId)));
        cartRepository.save(cart);
    }

    public void removeGameFromCart(UUID cartId, UUID gameId) {
        Cart cart = cartRepository.findById(cartId).orElseThrow(() -> new NotFoundException(cartId));
        cart.getGames().remove(gameRepository.findById(gameId).orElseThrow(() -> new NotFoundException(gameId)));
        cartRepository.save(cart);
    }

    public List<Game> getCartGames(UUID cartId) {
        Cart cart = cartRepository.findById(cartId).orElseThrow(() -> new NotFoundException(cartId));
        return cart.getGames();
    }
}
