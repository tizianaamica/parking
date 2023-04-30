package com.nelumbo.challenge.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RecordListDto {

        private Integer recordId;
        private String vehiclePlate;
        private OffsetDateTime vehicleEntryDate;
        
}
