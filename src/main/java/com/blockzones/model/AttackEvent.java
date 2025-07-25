
package com.blockzones.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Data
public class AttackEvent {
    @Id
    private UUID id = UUID.randomUUID();

    @ManyToOne
    @JoinColumn(name = "land_id")
    private Land land;

    private LocalDateTime timestamp;
    private int damage;
    private boolean successful;
}
