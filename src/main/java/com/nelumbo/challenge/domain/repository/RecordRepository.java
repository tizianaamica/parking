package com.nelumbo.challenge.domain.repository;

import com.nelumbo.challenge.domain.model.Record;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface RecordRepository extends JpaRepository<Record, Integer> {

    @Query("SELECT CASE WHEN COUNT(r) > 0 THEN true ELSE false END FROM Record r WHERE r.vehiclePlate = :vehiclePlate AND r.vehicleCheckout = false")
    boolean existsByVehiclePlateAndVehicleCheckoutIsFalse(String vehiclePlate);
    @Query("SELECT r FROM Record r WHERE r.vehiclePlate = :vehiclePlate AND r.vehicleCheckout = false")
    Optional<Record> findByVehiclePlateAndVehicleCheckoutIsFalse(String vehiclePlate);
    Record findByParkingId(Integer parkingId);

}
