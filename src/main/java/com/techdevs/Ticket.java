package com.techdevs;

import java.util.Date;

public class Ticket {

 private int id;
 private Date date;

 private String time,customerid,funcionid;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getCustomerid() {
        return customerid;
    }

    public void setCustomerid(String customerid) {
        this.customerid = customerid;
    }

    public String getFuncionid() {
        return funcionid;
    }

    public void setFuncionid(String funcionid) {
        this.funcionid = funcionid;
    }


}
