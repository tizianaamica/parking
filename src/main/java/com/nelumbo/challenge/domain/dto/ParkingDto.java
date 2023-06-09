package com.nelumbo.challenge.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ParkingDto {

    private Integer parkingId;
    private String parkingName;
    private Integer memberId;
    private Integer maxCapacity;
    private Boolean previous;
    private Integer hourlyRate;

}
