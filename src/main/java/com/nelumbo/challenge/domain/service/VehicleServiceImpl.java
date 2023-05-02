package com.nelumbo.challenge.domain.service;

import com.nelumbo.challenge.domain.dto.VehiclesTotalDto;
import com.nelumbo.challenge.domain.model.Vehicle;
import com.nelumbo.challenge.domain.repository.RecordRepository;
import com.nelumbo.challenge.domain.repository.VehicleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class VehicleServiceImpl implements VehicleService {

    private final VehicleRepository vehicleRepository;
    private final RecordRepository recordRepository;

    @Override
    public List<Vehicle> listOfVehiclesByParking(Integer parkingId) {
        return vehicleRepository.findByParkingId(parkingId);
    }

    @Override
    public List<Vehicle> listOfVehiclesByMemberId(Integer memberId) {
        return vehicleRepository.findVehicleByMemberId(memberId);
    }

    @Override
    public Vehicle findVehicleById(Integer vehicleId) {
        return vehicleRepository.findVehicleAndParkingForVehicleId(vehicleId);
    }

    @Override
    public List<VehiclesTotalDto> listOfMostRegisteredVehicles() {
        return recordRepository.findMoreRegisteredVehicles();
    }

}
