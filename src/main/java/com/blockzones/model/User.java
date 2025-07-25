
package com.blockzones.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Data
public class User {
    @Id
    private UUID id = UUID.randomUUID();

    @Column(unique = true, nullable = false)
    private String wallet;

    @Column(unique = true)
    private String nickname;

    private LocalDateTime createdAt = LocalDateTime.now();
    private LocalDateTime lastLogin;

    @Enumerated(EnumType.STRING)
    private Role role = Role.USER;

    public enum Role {
        USER, ADMIN
    }
}
