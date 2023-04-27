package com.nelumbo.challenge.domain.service;

import com.nelumbo.challenge.domain.model.Parking;
import com.nelumbo.challenge.domain.repository.ParkingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ParkingServiceImpl implements ParkingService {

    private final ParkingRepository parkingRepository;


    @Override
    public List<Parking> listOfParkings() {
        return null;
    }

    @Override
    public Parking findParkingById(Long id) {
        return null;
    }

    @Override
    public Parking saveParking(Parking parking) {
        return null;
    }

    @Override
    public Parking updateParking(Parking parking) {
        return null;
    }

    @Override
    public void deleteParking(Long id) {

    }
}
