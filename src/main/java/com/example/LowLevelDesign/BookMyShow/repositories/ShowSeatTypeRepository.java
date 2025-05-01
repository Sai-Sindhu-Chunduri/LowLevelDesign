package com.example.LowLevelDesign.BookMyShow.repositories;

import com.example.LowLevelDesign.BookMyShow.models.ShowSeatType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ShowSeatTypeRepository extends JpaRepository<ShowSeatType, Long> {
    List<ShowSeatType> findAllByShowId(Long showId);
}
