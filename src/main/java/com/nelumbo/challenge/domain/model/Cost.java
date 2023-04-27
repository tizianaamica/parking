package com.nelumbo.challenge.domain.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cost {

    @Id
    @Column(name = "cost_id")
    private Integer costId;

    @Column
    private String hourlyRate;

    @Column
    private String numberHours;

    @Column
    private Integer totalCost;

}
