package com.techdevs;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "customers")

public class Customer extends Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int personId;
    public int points;
    public String Category;



}
