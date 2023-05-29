package com.techdevs;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Position extends Employee{     //no está en DB

    private int personId;
    private int postion;

}
