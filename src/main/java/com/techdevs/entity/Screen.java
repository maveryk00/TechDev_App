package com.techdevs.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
@Table(name = "screen")
public class Screen {

    public enum ScreenFormat {
        FORMAT_2D, FORMAT_3D, PRIME
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int capacity;
    @Enumerated(EnumType.STRING)
    private ScreenFormat format;
    @Column(name = "branchId")
    private int branchId;

}

