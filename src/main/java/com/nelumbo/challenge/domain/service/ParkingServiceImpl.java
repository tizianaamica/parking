package com.nelumbo.challenge.domain.service;

import com.nelumbo.challenge.domain.exception.BadRequestException;
import com.nelumbo.challenge.domain.model.Parking;
import com.nelumbo.challenge.domain.model.Vehicle;
import com.nelumbo.challenge.domain.repository.ParkingRepository;
import com.nelumbo.challenge.domain.repository.VehicleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class ParkingServiceImpl implements ParkingService {

    private final ParkingRepository parkingRepository;
    private final VehicleRepository vehicleRepository;


    @Override
    public List<Parking> listOfParkings() {
        return parkingRepository.findAll();
    }

    @Override
    public Parking findParkingById(Integer id) {
        return parkingRepository.findAllByParkingId(id);
    }

    @Override
    public Parking saveParking(Parking parking) {
        Parking createParking = Parking.builder()
                .parkingName(parking.getParkingName())
                .memberId(parking.getMemberId())
                .maxCapacity(parking.getMaxCapacity())
                .previous(parking.getPrevious())
                .hourlyRate(parking.getHourlyRate())
                .build();
        return parkingRepository.save(createParking);
    }

    @Override
    public Parking updateParking(Integer id, Parking parking) {
        Optional<Parking> optionalExistingParking = parkingRepository.findById(id);
        if (optionalExistingParking.isPresent()){
            Parking existingParking = optionalExistingParking.get();
            Parking updateParking = Parking.builder()
                    .parkingId(existingParking.getParkingId())
                    .parkingName(parking.getParkingName())
                    .memberId(parking.getMemberId())
                    .maxCapacity(parking.getMaxCapacity())
                    .previous(parking.getPrevious())
                    .hourlyRate(parking.getHourlyRate())
                    .build();
            return parkingRepository.save(updateParking);
        } else {
            return null;
        }
    }

    @Override
    public void deleteParking(Integer parkingId) {
        Optional<Parking> parking = parkingRepository.findById(parkingId);
        if (parking.isPresent()) {
            List<Vehicle> vehicles = vehicleRepository.findVehiclesByParkingId(parkingId);
            if (vehicles.isEmpty()) {
                parkingRepository.deleteById(parkingId);
            } else {
                throw new BadRequestException("The parking with id " + parkingId + " has associated vehicles");
            }
        } else {
            throw new BadRequestException("There is no parking with that id: " + parkingId);
        }
    }

}
