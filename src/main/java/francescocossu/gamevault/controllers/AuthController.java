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
    public NewUserResponseDTO createUser(@RequestBody @Validated UserDTO body, BindingResult validationResult) {
        if (validationResult.hasErrors()) {
            StringBuilder errorMessage = new StringBuilder("Validation errors: ");
            validationResult.getAllErrors().forEach(error -> errorMessage.append(error.getDefaultMessage()).append("; "));
            throw new BadRequestException(errorMessage.toString());
        }

        try {
            return new NewUserResponseDTO(this.userService.saveUser(body).getId());
        } catch (BadRequestException e) {
            throw e;
        }
    }

}
