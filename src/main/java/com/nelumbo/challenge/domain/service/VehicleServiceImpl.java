package com.nelumbo.challenge.domain.service;

import com.nelumbo.challenge.domain.model.Vehicle;
import com.nelumbo.challenge.domain.repository.VehicleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class VehicleServiceImpl implements VehicleService {

    private final VehicleRepository vehicleRepository;

    @Override
    public List<Vehicle> listOfVehicles() {
        return vehicleRepository.findAll();
    }

    @Override
    public List<Vehicle> listOfVehiclesByParkingIdAndMemberId(Integer memberId) {
        return vehicleRepository.findVehicleByMemberId(memberId);
    }

    @Override
    public Vehicle findVehicleById(Integer vehicleId) {
        return vehicleRepository.findVehicleAndParkingForVehicleId(vehicleId);
    }

}
