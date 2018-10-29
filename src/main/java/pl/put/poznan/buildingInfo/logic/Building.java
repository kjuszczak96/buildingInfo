package pl.put.poznan.buildingInfo.logic;


import java.util.Random;

public class Building {

    private int id;
    private String name;

    public Building() {}

    public Building(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
}
