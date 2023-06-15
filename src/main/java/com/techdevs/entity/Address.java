package com.techdevs.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
@Table(name = "address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String line1;
    private String line2;
    @Column(name = "districtId")
    private int districtId;
    @Column(name = "cityId")
    private int cityId;
    @Column(name = "departmentId")
    private int departmentId;
    @Column(name = "zipCode")
    private String zipCode;
}
