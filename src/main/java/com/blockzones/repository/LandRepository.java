
package com.blockzones.repository;

import com.blockzones.model.Land;
import com.blockzones.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface LandRepository extends JpaRepository<Land, UUID> {
    List<Land> findByOwner(User owner);
}
