package com.techdevs;


import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor

@Table(name = "employee")
public class Employee extends Person{

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)

    private int personId;
    private int postion;

}
