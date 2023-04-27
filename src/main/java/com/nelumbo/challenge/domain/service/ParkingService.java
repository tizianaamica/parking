package com.nelumbo.challenge.domain.service;


import com.nelumbo.challenge.domain.model.Parking;

import java.util.List;

public interface ParkingService {


    List<Parking> listOfParkings();

    Parking findParkingById(Long id);

    Parking saveParking(Parking parking);

    Parking updateParking(Parking parking);

    void deleteParking(Long id);
}
