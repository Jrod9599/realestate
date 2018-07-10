package com.example.demo.models;


public class Realestate {
    private int tt_id;
    private String tt_name;
    private int tt_age;

    public Realestate() {
    }

    public Realestate(int tt_id, String tt_name, int tt_age) {
        this.tt_id = tt_id;
        this.tt_name = tt_name;
        this.tt_age = tt_age;
    }

    public int getTt_id() {
        return tt_id;
    }

    public void setTt_id(int tt_id) {
        this.tt_id = tt_id;
    }

    public String getTt_name() {
        return tt_name;
    }

    public void setTt_name(String tt_name) {
        this.tt_name = tt_name;
    }

    public int getTt_age() {
        return tt_age;
    }

    public void setTt_age(int tt_age) {
        this.tt_age = tt_age;
    }
}
