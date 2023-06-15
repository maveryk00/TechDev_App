package com.techdevs.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
@Table(name = "customer")
public class Customer {

    public enum Category {
        CLASSIC, SILVER, GOLD, BLACK
    }

    @Id
    @Column(name = "personId")
    private int personId;
    public int points;
    @Enumerated(EnumType.STRING)
    public Category category;

}
