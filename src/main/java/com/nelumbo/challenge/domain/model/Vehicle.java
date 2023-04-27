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
    @Column(name = "id_vehiculo")
    private Integer vehicleId;

    @Column
    private String vehicleMake;

    @Column
    private String vehicleType;

    @Column
    private String vehiclePlate;

}
