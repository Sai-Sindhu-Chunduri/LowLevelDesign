package com.example.LowLevelDesign.BookMyShow.services;

import com.example.LowLevelDesign.BookMyShow.models.Show;
import com.example.LowLevelDesign.BookMyShow.models.ShowSeat;
import com.example.LowLevelDesign.BookMyShow.models.ShowSeatType;
import com.example.LowLevelDesign.BookMyShow.repositories.ShowSeatTypeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PriceCalculationService {

    ShowSeatTypeRepository showSeatTypeRepository;

    public PriceCalculationService(ShowSeatTypeRepository showSeatTypeRepository) {
        this.showSeatTypeRepository = showSeatTypeRepository;
    }

    public int getPrice(List<ShowSeat> showSeats, Show show) {
        // get showseatType by showid
        List<ShowSeatType> showSeatTypes = showSeatTypeRepository.findAll();

        int amount = 0;

        for(ShowSeat showSeat : showSeats) {
            for(ShowSeatType showSeatType: showSeatTypes) {
                if(showSeat.getSeat().getSeatType().equals(showSeatType.getSeatType())) {
                    amount += showSeatType.getPrice();
                    break;
                }
            }
        }


        return amount;
    }

}
