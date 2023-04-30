package com.nelumbo.challenge.domain.repository;

import com.nelumbo.challenge.domain.model.Record;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RecordRepository extends JpaRepository<Record, Integer> {
    boolean existsByVehiclePlate(String vehiclePlate);
    Optional<Record> findByVehiclePlate(String vehiclePlate);
    Record findByParkingId(Integer parkingId);

}
