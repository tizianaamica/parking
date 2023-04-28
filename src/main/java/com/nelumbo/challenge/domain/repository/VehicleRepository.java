package com.nelumbo.challenge.domain.repository;

import com.nelumbo.challenge.domain.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {
    List<Vehicle> findByParkingId(Integer parkingId);

}
