package com.nelumbo.challenge.domain.service;


import com.nelumbo.challenge.domain.model.Parking;

import java.util.List;

public interface ParkingService {


    List<Parking> listOfParkings();

    Parking findParkingById(Integer id);

    Parking saveParking(Parking parking);

    Parking updateParking(Integer id, Parking parking);

    void deleteParking(Integer id);
}
