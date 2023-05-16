package com.techdevs;

public class Branch {
    private int id;
    private String name;
    private int addressId;
    private Date openHour, closeHour;
    private List<String> availableMovies;

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public String getOpenHours() {
        return openHours;
    }

    public void setOpenHours(String openHours) {
        this.openHours = openHours;
    }

    // Function that returns the address values taken from the database joined together
    public String getFullAddress(){
        // Connection
        // Queries strings for the database
        // Statements
        // Result set
        // values taken from result set
        // fullAddress = address.line1 + address.line2 + district.name + city.name + department.name + address.zipCode
        return fullAddress;
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
