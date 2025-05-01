package com.example.LowLevelDesign.parkinglot.repositories;


import com.example.LowLevelDesign.parkinglot.models.Gate;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class GateRepository {
    private Map<Long, Gate> gateMap = new HashMap<>();

    public Optional<Gate> findGateById(long id) {
        if(gateMap.containsKey(id)) {
            return Optional.of(gateMap.get(id));
        }

        return Optional.empty();
    }

    public Gate findGateById1(long id) {
        if(gateMap.containsKey(id)) {
            return gateMap.get(id);
        }

        return  null;
    }
}
