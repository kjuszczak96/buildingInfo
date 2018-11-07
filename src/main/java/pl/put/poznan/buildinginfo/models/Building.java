package pl.put.poznan.buildinginfo.models;

public class Building extends Location {
  private Level[] levels;

  public Level[] getLevels() {
    return levels;
  }

  public float getArea() {
    float area = 0;
    for(int i = 0; i < levels.length; i++)
    {
      area = area + levels[i].getArea();
    }
    return area;
  }

  public float getVolume() {
    return 1;
  }

  public float getIlluminationPower() {
    float power = 0;
    for (int i = 0; i < levels.length; i++)
      power += levels[i].getIlluminationPower();
    return power;
  }
}