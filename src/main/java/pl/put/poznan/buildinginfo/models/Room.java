package pl.put.poznan.buildinginfo.models;

public class Room extends Location {
  private float area;
  private float cube;
  private float heating;
  private float light;

  public float getArea() {
    return area;
  }

  public float getCube() {
    return cube;
  }

  public float getHeating() {
    return heating;
  }

  public float getLight() {
    return light;
  }
}