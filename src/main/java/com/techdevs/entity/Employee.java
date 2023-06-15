package com.techdevs.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Table(name = "employee")
public class Employee {

    public enum Position {
        ASSISTANT, ADMIN
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int personId;
    @Enumerated(EnumType.STRING)
    private Position position;

}
