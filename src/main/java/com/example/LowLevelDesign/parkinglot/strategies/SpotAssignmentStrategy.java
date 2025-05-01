package com.example.LowLevelDesign.parkinglot.strategies;

import com.example.LowLevelDesign.parkinglot.models.ParkingSpot;
import com.example.LowLevelDesign.parkinglot.models.VehicleType;

public interface SpotAssignmentStrategy {
    ParkingSpot assignSpot(VehicleType vehicleType, Long gateId);
}
