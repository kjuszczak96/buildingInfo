package pl.put.poznan.transformer.models;

public class Building extends Location {
    Level[] levels;

    public Level[] getLevels(){
        return this.levels;
    }
}