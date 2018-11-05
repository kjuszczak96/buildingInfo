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
    float totalVolume = 0;
    for (Level level : levels) {
      totalVolume += level.getVolume();
    }
    return totalVolume;
  }

  public float getIlluminationPower() {
    return 1;
  }
}