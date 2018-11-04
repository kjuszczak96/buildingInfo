package pl.put.poznan.buildinginfo.models;

public class Building extends Location {
  private Level[] levels;

  public Level[] getLevels() {
    return levels;
  }

  public float getArea() {
    return 1;
  }

  public float getVolume() {
    return 1;
  }

  public float getIlluminationPower() {
    return 1;
  }
}