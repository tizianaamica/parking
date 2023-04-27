package com.nelumbo.challenge.domain.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Record {

    @Id
    @Column(name = "record_id")
    private Integer recordId;

    @Column
    private String vehicleEntryDate;

    @Column
    private String vehicleExitDate;

}
