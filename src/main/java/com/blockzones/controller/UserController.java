
package com.blockzones.controller;

import com.blockzones.model.User;
import com.blockzones.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public ResponseEntity<User> register(@RequestParam String wallet, @RequestParam String nickname) {
        User user = userService.createUser(wallet, nickname);
        return ResponseEntity.ok(user);
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUser(@PathVariable UUID id) {
        Optional<User> user = userService.findById(id);
        return user.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @RestController
    public static class TestController {
        @GetMapping("/hello")
        public String hello() {
            System.out.println("Endpoint /hello chiamato!");
            return "Hello from backend!";
        }
    }

}
