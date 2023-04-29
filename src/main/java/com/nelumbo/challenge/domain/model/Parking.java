package com.nelumbo.challenge.domain.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Parking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "parking_id")
    private Integer parkingId;

    @Column
    private String parkingName;

    @Column
    private String parkingAddress;

    @Column
    private String parkingPhone;

    @Column
    private Integer memberId;

    @Column
    private Integer maxCapacity;

    @Column
    private Boolean previous;

}
