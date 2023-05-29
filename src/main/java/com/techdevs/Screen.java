package com.techdevs;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.text.Format;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "screen")

public class Screen {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private long id;
    private String name;
    private int capacity;
    private String format;
    private int branchId;

}
