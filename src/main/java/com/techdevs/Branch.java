package com.techdevs;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "branch")

public class Branch {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    @Column(name = "addressId")
    private int addressId;
    private Date openHour, closeHour;
    private List<String> availableMovies;


    // Function that returns the address values taken from the database joined together
    public String getFullAddress() {
        // Connection
        // Queries strings for the database
        // Statements
        // Result set
        // values taken from result set
        // fullAddress = address.line1 + address.line2 + district.name + city.name + department.name + address.zipCode
        // return fullAddress;
        return null;
    }

    // Function that returns a boolean value indicating whether the cinema branch is open
    public boolean isOpen(){
        // Compare openHours time with the current limit of time
        // DateTime currentTime = new DateTime();
        // if in range returns true
        return true;
    }

    // function that adds available movies to the list with the same name
    public void getMoviesAvailable(){
        // creates instace of functions from another class
        // stores each movie from function in an element of the list availableMovies;
    }

    // Function that prints in console the list of available movies in the cinema branch
    public void printAvailableMovies(){

    }
}
