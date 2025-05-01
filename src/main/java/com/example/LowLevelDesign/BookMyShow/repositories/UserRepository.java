package com.example.LowLevelDesign.BookMyShow.repositories;

import com.example.LowLevelDesign.BookMyShow.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    @Override
    Optional<User> findById(Long aLong);

    Optional<User> findByEmail(String email);
}
