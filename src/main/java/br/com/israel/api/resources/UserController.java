package br.com.israel.api.resources;

import br.com.israel.api.domain.User;
import br.com.israel.api.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    private UserService userService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<User> findByid(@PathVariable Integer id){
        return ResponseEntity.ok().body(userService.findById(id));
    }
}
