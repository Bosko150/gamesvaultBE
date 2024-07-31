package francescocossu.gamevault.services;


import francescocossu.gamevault.entities.Cart;
import francescocossu.gamevault.entities.User;
import francescocossu.gamevault.exceptions.BadRequestException;
import francescocossu.gamevault.exceptions.NotFoundException;
import francescocossu.gamevault.payloads.UserDTO;
import francescocossu.gamevault.repositories.CartRepository;
import francescocossu.gamevault.repositories.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserService {

    @Autowired
    PasswordEncoder bcrypt;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PasswordEncoder bCrypt;
    @Autowired
    private CartRepository cartRepository;


    public User findById(UUID id) {
        return userRepository.findById(id).orElseThrow(() -> new NotFoundException(id));
    }

    public User findByEmail(String email) {
        return userRepository.findByEmail(email).orElseThrow(() -> new NotFoundException(email));
    }

    @Transactional
    public User saveUser(UserDTO userPayload) {

        userRepository.findByEmail(userPayload.email()).ifPresent(utente -> {
            throw new BadRequestException("The user with email: " + userPayload.email() + " already exists.");
        });
        
        User user = new User(userPayload.name(), userPayload.surname(), userPayload.username(), userPayload.email(), bCrypt.encode(userPayload.password()));

        Cart cart = new Cart();
        cart.setUser(user);
        user.setCart(cart);

        cartRepository.save(cart);
        return userRepository.save(user);
    }

    public User updateUser(User user) {
        return userRepository.save(user);
    }

    public User findByUsername(String username) {
        return userRepository.findByUsername(username).orElseThrow(() -> new NotFoundException(username));
    }


}
