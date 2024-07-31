package francescocossu.gamevault.controllers;


import francescocossu.gamevault.entities.User;
import francescocossu.gamevault.payloads.UserProfilePicDTO;
import francescocossu.gamevault.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping("/{id}")
    public User findById(@PathVariable UUID id) {
        return userService.findById(id);
    }

    @GetMapping("/{username}")
    public User findByUsername(@PathVariable String username) {
        return userService.findByUsername(username);
    }

    @GetMapping("/me")
    public User getOwnProfile(@AuthenticationPrincipal User currentAuthenticatedUser) {
        return userService.findById(currentAuthenticatedUser.getId());
    }

    @PostMapping("/update")
    public User updateUser(@AuthenticationPrincipal User currentAuthenticatedUser, @RequestBody UserProfilePicDTO userProfilePicDTO) {
        User user = userService.findById(currentAuthenticatedUser.getId());
        user.setProfilePic(userProfilePicDTO.profilePic());
        return userService.updateUser(user);


    }
}



