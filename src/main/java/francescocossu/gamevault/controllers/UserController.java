package francescocossu.gamevault.controllers;


import francescocossu.gamevault.entities.User;
import francescocossu.gamevault.payloads.UserEditProfileDTO;
import francescocossu.gamevault.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
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

    @PutMapping("/update")
    public User updateUser(@AuthenticationPrincipal User currentAuthenticatedUser, @RequestBody UserEditProfileDTO userEditProfileDTO) {
        User user = userService.findById(currentAuthenticatedUser.getId());
        userService.editProfile(userEditProfileDTO, user);
        return userService.updateUser(user);


    }

    @PostMapping("/{id}/avatar")
    public String uploadAvatar(@RequestParam("avatar") MultipartFile file, @PathVariable UUID id) throws IOException {
        return userService.uploadAvatar(file, id);

    }


}



