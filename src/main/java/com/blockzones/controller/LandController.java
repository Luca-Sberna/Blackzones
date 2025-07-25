
package com.blockzones.controller;

import com.blockzones.model.Land;
import com.blockzones.service.LandService;
import com.blockzones.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/lands")
public class LandController {
    private final LandService landService;
    private final UserService userService;

    public LandController(LandService landService, UserService userService) {
        this.landService = landService;
        this.userService = userService;
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<Land>> getUserLands(@PathVariable UUID userId) {
        return userService.findById(userId)
                .map(user -> ResponseEntity.ok(landService.getUserLands(user)))
                .orElse(ResponseEntity.notFound().build());
    }
}
