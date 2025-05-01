package com.example.LowLevelDesign.parkinglot.strategies;

import com.example.LowLevelDesign.parkinglot.models.ParkingSpot;
import com.example.LowLevelDesign.parkinglot.models.VehicleType;

public class CheapestSportAssignmentStrategy implements SpotAssignmentStrategy{

    @Override
    public ParkingSpot assignSpot(VehicleType vehicleType, Long gateId) {
        return null;
    }
}
