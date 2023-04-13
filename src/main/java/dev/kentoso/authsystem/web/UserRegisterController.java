package dev.kentoso.authsystem.web;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import dev.kentoso.authsystem.models.User;
import dev.kentoso.authsystem.services.UserService;
import dev.kentoso.authsystem.web.dto.UserRegisterDto;

@RestController
@RequestMapping("/register")
public class UserRegisterController {
    
    private UserService userService;


    public UserRegisterController(UserService userService) {
        super();
        this.userService = userService;
    }
    
    @PostMapping()
    public User registerUser(@RequestBody UserRegisterDto RegisterDto) {
        try {
            return userService.save(RegisterDto);   
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.UNPROCESSABLE_ENTITY, "No se pudo procesar", e);
        }
    }

}
