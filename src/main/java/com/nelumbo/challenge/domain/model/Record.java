package com.nelumbo.challenge.domain.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.OffsetDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Record {

    @Id
    private Integer recordId;

    @Column
    @CreationTimestamp
    private OffsetDateTime vehicleEntryDate;

    @Column
    @CreationTimestamp
    private OffsetDateTime vehicleExitDate;

}
