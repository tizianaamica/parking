package com.nelumbo.challenge.domain.service;

import com.nelumbo.challenge.domain.dto.VehiclesTotalDto;
import com.nelumbo.challenge.domain.model.Vehicle;

import java.util.List;

public interface VehicleService {

    List<Vehicle> listOfVehiclesByParking(Integer parkingId);
    List<Vehicle> listOfVehiclesByMemberId(Integer memberId);
    Vehicle findVehicleById(Integer vehicleId);
    List<VehiclesTotalDto> listOfMostRegisteredVehicles();

}
