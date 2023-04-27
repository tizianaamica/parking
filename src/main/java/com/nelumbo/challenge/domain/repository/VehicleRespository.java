package com.nelumbo.challenge.domain.repository;

import com.nelumbo.challenge.domain.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRespository extends JpaRepository<Vehicle, Integer> {
}
