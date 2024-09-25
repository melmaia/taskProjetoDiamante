package br.com.fiap.tasks.tasks.auth;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    
    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    private final AuthService authService;


    @PostMapping("/login")
    public Token login(@RequestBody Credentials credentials){
        return authService.login(credentials);
    }

}
