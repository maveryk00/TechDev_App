package com.techdevs;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ticket")


public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private long id;
    private Date date;
    private String time;
    private String customerid;
    private String funcionid;


}






