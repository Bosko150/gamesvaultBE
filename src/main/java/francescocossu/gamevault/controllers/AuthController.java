package francescocossu.gamevault.controllers;

import francescocossu.gamevault.exceptions.BadRequestException;
import francescocossu.gamevault.payloads.NewUserResponseDTO;
import francescocossu.gamevault.payloads.UserDTO;
import francescocossu.gamevault.payloads.UserLoginDTO;
import francescocossu.gamevault.payloads.UserLoginResponseDTO;
import francescocossu.gamevault.services.AuthService;
import francescocossu.gamevault.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {
    @Autowired
    private AuthService authService;
    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public UserLoginResponseDTO login(@RequestBody UserLoginDTO payload) {
        return new UserLoginResponseDTO(authService.authenticateUtenteAndGenerateToken(payload));
    }

    @PostMapping("/register")
    @ResponseStatus(HttpStatus.CREATED)
    public NewUserResponseDTO saveUtenti(@RequestBody @Validated UserDTO body, BindingResult validationResult) {
        if (validationResult.hasErrors()) {
            System.out.println(validationResult.getAllErrors());
            throw new BadRequestException(validationResult.getAllErrors());
        }
        System.out.println(body);
        return new NewUserResponseDTO(this.userService.saveUser(body).getId());
    }

}
