package com.nelumbo.challenge.domain.repository;

import com.nelumbo.challenge.domain.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {

    @Query("SELECT v FROM Vehicle v JOIN Parking p ON v.parkingId = p.parkingId WHERE p.memberId = :memberId")
    List<Vehicle> findVehicleByMemberId(Integer memberId);

    @Query(value =
                "SELECT " +
                        "v.*, p.* " +
                "FROM " +
                        "vehicle v " +
                "JOIN " +
                        "parking p ON v.parking_id = p.parking_id " +
                "WHERE " +
                        "v.vehicle_id = :vehicleId",
            nativeQuery = true)
    Vehicle findVehicleAndParkingForVehicleId(Integer vehicleId);

    @Query("SELECT v FROM Vehicle v JOIN Parking p ON v.parkingId = p.parkingId WHERE p.parkingId = :parkingId")
    List<Vehicle> findVehiclesByParkingId(Integer parkingId);

    @Query("SELECT r.vehiclePlate FROM Vehicle v JOIN Record r ON v.vehicleId = r.vehicleId WHERE v.parkingId = :parkingId")
    List<Vehicle> findByParkingId(Integer parkingId);

    boolean existsByVehiclePlate(String vehiclePlate);

    Vehicle findByVehiclePlate(String vehiclePlate);

}
