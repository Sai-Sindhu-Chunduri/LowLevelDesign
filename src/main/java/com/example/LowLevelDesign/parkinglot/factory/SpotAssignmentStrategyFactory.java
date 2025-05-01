package com.example.LowLevelDesign.parkinglot.factory;

import com.example.LowLevelDesign.parkinglot.models.SpotAssignmentStrategyType;
import com.example.LowLevelDesign.parkinglot.strategies.CheapestSportAssignmentStrategy;
import com.example.LowLevelDesign.parkinglot.strategies.RandomSpotAssignmentStrategy;
import com.example.LowLevelDesign.parkinglot.strategies.SpotAssignmentStrategy;

public class SpotAssignmentStrategyFactory {
    public static SpotAssignmentStrategy getSpotAssignmentStrategy(SpotAssignmentStrategyType type) {
        if(type.equals(SpotAssignmentStrategyType.CHEAP)) {
            return new CheapestSportAssignmentStrategy();
        } else {
            return new RandomSpotAssignmentStrategy();
        }
    }
}
