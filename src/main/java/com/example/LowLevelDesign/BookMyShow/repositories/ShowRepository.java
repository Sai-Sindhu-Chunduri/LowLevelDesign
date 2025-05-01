package com.example.LowLevelDesign.BookMyShow.repositories;

import com.example.LowLevelDesign.BookMyShow.models.Show;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ShowRepository extends JpaRepository<Show, Long> {
    // Get show by id
    Optional<Show> findById(Long id);
}
