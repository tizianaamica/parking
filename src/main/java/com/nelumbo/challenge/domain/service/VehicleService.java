package com.nelumbo.challenge.domain.service;

import com.nelumbo.challenge.domain.model.Vehicle;

import java.util.List;

public interface VehicleService {

    List<Vehicle> listOfVehicles();
    List<Vehicle> listOfVehiclesByMemberId(Integer memberId);
    Vehicle findVehicleById(Integer vehicleId);

}
