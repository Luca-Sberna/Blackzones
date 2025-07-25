
package com.blockzones.service;

import com.blockzones.model.User;
import com.blockzones.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Optional<User> findByWallet(String wallet) {
        return userRepository.findByWallet(wallet);
    }

    public User createUser(String wallet, String nickname) {
        User user = new User();
        user.setWallet(wallet);
        user.setNickname(nickname);
        return userRepository.save(user);
    }

    public Optional<User> findById(UUID id) {
        return userRepository.findById(id);
    }
}
