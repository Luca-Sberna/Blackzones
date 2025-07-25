
package com.blockzones.service;

import com.blockzones.model.Land;
import com.blockzones.model.User;
import com.blockzones.repository.LandRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class LandService {
    private final LandRepository landRepository;

    public LandService(LandRepository landRepository) {
        this.landRepository = landRepository;
    }

    public List<Land> getUserLands(User user) {
        return landRepository.findByOwner(user);
    }

    public Optional<Land> findById(UUID id) {
        return landRepository.findById(id);
    }

    public Land save(Land land) {
        return landRepository.save(land);
    }
}
