package francescocossu.gamevault.services;


import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import francescocossu.gamevault.entities.Cart;
import francescocossu.gamevault.entities.User;
import francescocossu.gamevault.exceptions.BadRequestException;
import francescocossu.gamevault.exceptions.NotFoundException;
import francescocossu.gamevault.payloads.UserDTO;
import francescocossu.gamevault.payloads.UserEditProfileDTO;
import francescocossu.gamevault.repositories.CartRepository;
import francescocossu.gamevault.repositories.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.UUID;

@Service
public class UserService {

    @Autowired
    PasswordEncoder bcrypt;
    @Autowired
    Cloudinary cloudinaryService;
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

    public String uploadAvatar(MultipartFile file, UUID id) throws IOException {
        String cloudinaryUrl = cloudinaryService.uploader().upload(file.getBytes(), ObjectUtils.emptyMap()).get("url").toString();

        User user = findById(id);
        user.setProfilePic(cloudinaryUrl);
        userRepository.save(user);
        return cloudinaryUrl;

    }

    public User editProfile(UserEditProfileDTO userEditProfileDTO, User user) {
        user.setProfilePic(userEditProfileDTO.profilePic());
        user.setUsername(userEditProfileDTO.username());
        user.setName(userEditProfileDTO.name());
        user.setSurname(userEditProfileDTO.surname());
        return userRepository.save(user);


    }
}
