
package com.blockzones.repository;

import com.blockzones.model.AttackEvent;
import com.blockzones.model.Land;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface AttackEventRepository extends JpaRepository<AttackEvent, UUID> {
    List<AttackEvent> findByLand(Land land);
}
