package com.nelumbo.challenge.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class VehicleDto {

    private Integer vehicleId;
    private String vehicleMake;
    private String vehicleType;
    private String vehiclePlate;

}
