
package com.blockzones.repository;

import com.blockzones.model.TokenWallet;
import com.blockzones.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface TokenWalletRepository extends JpaRepository<TokenWallet, UUID> {
    Optional<TokenWallet> findByUser(User user);
}
