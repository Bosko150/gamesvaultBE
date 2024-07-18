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
        // Controlla se l'utente con lo stesso email esiste già
        this.userRepository.findByEmail(userPayload.email()).ifPresent(utente -> {
            throw new BadRequestException("The user with email: " + userPayload.email() + ", already exists.");
        });

        // Crea un nuovo oggetto User con i dati ricevuti
        User user = new User(userPayload.name(), userPayload.surname(), userPayload.username(), userPayload.email(), bCrypt.encode(userPayload.password()));

        // Crea un nuovo carrello vuoto per l'utente
        Cart cart = new Cart();
        cart.setUser(user); // Imposta l'utente nel carrello

        // Associa il carrello all'utente
        user.setCart(cart);

        // Salva il carrello nel repository
        cartRepository.save(cart);

        // Salva l'utente nel repository
        return userRepository.save(user);
    }

    public User updateUser(User user) {
        return userRepository.save(user);
    }

    public User findByUsername(String username) {
        return userRepository.findByUsername(username).orElseThrow(() -> new NotFoundException(username));
    }


}
