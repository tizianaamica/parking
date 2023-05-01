package com.nelumbo.challenge.domain.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import static jakarta.persistence.FetchType.EAGER;

@Entity
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer vehicleId;

    @Column
    private String vehicleMake;

    @Column
    private String vehicleType;

    @Column
    private String vehiclePlate;

    @Column(name = "parking_id")
    private Integer parkingId;

//    @ManyToOne(fetch = EAGER)
//    @JoinColumn(name="parkingId")
//    private Parking parking;

}
