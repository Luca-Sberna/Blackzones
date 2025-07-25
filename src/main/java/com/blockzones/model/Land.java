
package com.blockzones.model;

import jakarta.persistence.*;
import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Data
public class Land {
    @Id
    private UUID id = UUID.randomUUID();

    private String nftId;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private User owner;

    @Enumerated(EnumType.STRING)
    private Rarity rarity;

    private int coordX;
    private int coordY;

    private BigDecimal production;
    private int maxHealth;
    private int currentHealth;
    private boolean damaged;
    private LocalDateTime repairableAt;

    private boolean boosted;
    private LocalDateTime boostExpiresAt;

    public enum Rarity {
        COMMON, RARE, EPIC, LEGENDARY
    }
}
