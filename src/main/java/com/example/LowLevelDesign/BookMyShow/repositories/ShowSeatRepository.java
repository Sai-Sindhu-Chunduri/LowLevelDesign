package com.example.LowLevelDesign.BookMyShow.repositories;

import com.example.LowLevelDesign.BookMyShow.models.ShowSeat;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ShowSeatRepository extends JpaRepository<ShowSeat, Long> {

    List<ShowSeat> findAllById(Iterable<Long> longs);
}
