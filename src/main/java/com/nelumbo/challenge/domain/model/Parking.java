package com.nelumbo.challenge.domain.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Parking {

    @Id
    @Column(name = "parking_id")
    private Integer parkingId;

    @Column
    private String name;

    @Column
    private String adress;

    @Column
    private String phone;

}
