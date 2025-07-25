
package com.blockzones.model;

import jakarta.persistence.*;
import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Data
public class RepairLog {
    @Id
    private UUID id = UUID.randomUUID();

    @ManyToOne
    @JoinColumn(name = "land_id")
    private Land land;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private LocalDateTime repairedAt;
    private BigDecimal costInToken;
}
