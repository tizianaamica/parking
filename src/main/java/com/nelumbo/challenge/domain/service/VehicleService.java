package com.nelumbo.challenge.domain.service;

import com.nelumbo.challenge.domain.model.Vehicle;

import java.util.List;

public interface VehicleService {

    List<Vehicle> listOfVehiclesByParkingIdAndMemberId(Integer memberId);

    List<Vehicle> listOfVehicles();

    Vehicle findVehicleById(Integer vehicleId);

}
