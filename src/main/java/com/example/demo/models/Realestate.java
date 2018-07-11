package com.example.demo.models;


public class Realestate {
    private String Address;
    private String City;
    private String State;
    private String Owner;

    public Realestate() {
    }

    public Realestate(String Address, String city, String state, String owner) {
        this.Address = Address;
        City = city;
        State = state;
        Owner = owner;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getOwner() {
        return Owner;
    }

    public void setOwner(String owner) {
        Owner = owner;
    }
}
