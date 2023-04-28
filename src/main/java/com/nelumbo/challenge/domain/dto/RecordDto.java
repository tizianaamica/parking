package com.nelumbo.challenge.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RecordDto {

    private Integer recordId;
    private Integer parkingId;
    private String vehiclePlate;
    private String vehicleEntryDate;
    private String vehicleExitDate;

}
