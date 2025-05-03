package com.example.LowLevelDesign.splitwise.repository;

import com.example.LowLevelDesign.splitwise.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    @Override
    Optional<User> findById(Long aLong);
}
