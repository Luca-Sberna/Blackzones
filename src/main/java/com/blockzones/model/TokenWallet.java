
package com.blockzones.model;

import jakarta.persistence.*;
import lombok.Data;
import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Data
public class TokenWallet {
    @Id
    private UUID id = UUID.randomUUID();

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    private BigDecimal balance;
}
