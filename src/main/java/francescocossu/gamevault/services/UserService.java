package francescocossu.gamevault.services;


import francescocossu.gamevault.entities.User;
import francescocossu.gamevault.exceptions.NotFoundException;
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


    public User findById(UUID id) {
        return userRepository.findById(id).orElseThrow(() -> new NotFoundException(id));
    }


}
