package com.nelumbo.challenge.domain.repository;

import com.nelumbo.challenge.domain.model.Parking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParkingRepository extends JpaRepository<Parking, Integer> {

}
