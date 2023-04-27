package com.nelumbo.challenge.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CostDto {

        private Integer costId;
        private String hourlyRate;
        private String numberHours;
        private Integer totalCost;
}
