package br.com.israel.api.resources;

import br.com.israel.api.domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @GetMapping(value = "/{id}")
    public ResponseEntity<User> findByid(@PathVariable Integer id){
        return ResponseEntity.ok().body(new User(1, "Israel", "israel@gmail.com", "123"));
    }
}
