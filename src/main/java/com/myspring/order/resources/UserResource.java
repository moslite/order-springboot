package com.myspring.order.resources;

import com.myspring.order.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(1L, "Murilo", "moslite@hotmail.com", "99999999", "teste");
        return ResponseEntity.ok().body(u);
    }

}
