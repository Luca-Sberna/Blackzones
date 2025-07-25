
package com.blockzones.repository;

import com.blockzones.model.RepairLog;
import com.blockzones.model.Land;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface RepairLogRepository extends JpaRepository<RepairLog, UUID> {
    List<RepairLog> findByLand(Land land);
}
