package com.techdevs;


public class Employee extends Person{

    private int idEmployee;
    private String startDate;   //Fecha de inicio de trabajo
    private String endDate;     //Fecha de fin de trabajo


    //Getters and setters
    public int getIdEmployee() {
        return idEmployee;
    }
    public void setIdEmployee(int idEmployee) {
        this.idEmployee = idEmployee;
    }
    public String getStartDate() {
        return startDate;
    }
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }
    public String getEndDate() {
        return endDate;
    }
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    



}
