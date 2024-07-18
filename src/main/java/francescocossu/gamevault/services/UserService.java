package francescocossu.gamevault.services;


import francescocossu.gamevault.entities.User;
import francescocossu.gamevault.exceptions.BadRequestException;
import francescocossu.gamevault.exceptions.NotFoundException;
import francescocossu.gamevault.payloads.UserDTO;
import francescocossu.gamevault.repositories.UserRepository;
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


    public User findById(UUID id) {
        return userRepository.findById(id).orElseThrow(() -> new NotFoundException(id));
    }

    public User findByEmail(String email) {
        return userRepository.findByEmail(email).orElseThrow(() -> new NotFoundException(email));
    }

    public User saveUser(UserDTO userPayload) {
        this.userRepository.findByEmail(userPayload.email()).ifPresent(utente -> {
            throw new BadRequestException("The user with email: " + userPayload.email() + ", already exist.");
        });
        User user = new User(userPayload.name(), userPayload.surname(), userPayload.username(), userPayload.email(), bCrypt.encode(userPayload.password()));
        return this.userRepository.save(user);
    }

    public User updateUser(User user) {
        return userRepository.save(user);
    }

    public User findByUsername(String username) {
        return userRepository.findByUsername(username).orElseThrow(() -> new NotFoundException(username));
    }


}
