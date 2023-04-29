package com.nelumbo.challenge.domain.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Vehicle {

    @Id
    private Integer vehicleId;

    @Column
    private String vehicleMake;

    @Column
    private String vehicleType;

    @Column
    private String vehiclePlate;

    @Column
    private Integer parkingId;

}
