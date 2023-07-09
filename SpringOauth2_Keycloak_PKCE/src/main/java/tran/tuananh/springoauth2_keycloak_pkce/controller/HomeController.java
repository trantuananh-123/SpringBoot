package tran.tuananh.springoauth2_keycloak_pkce.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class HomeController {

    @GetMapping("")
    @ResponseStatus(HttpStatus.OK)
    public String home() {
        return "Hello";
    }
}
