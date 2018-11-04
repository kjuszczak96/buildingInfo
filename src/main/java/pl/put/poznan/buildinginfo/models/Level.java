package pl.put.poznan.buildinginfo.models;

public class Level extends Location {
  private Room[] rooms;

  public Room[] getRooms() {
    return rooms;
  }

  public float getArea() {
    return 2;
  }

  public float getVolume() {
    return 2;
  }

  public float getIlluminationPower() {
    return 2;
  }
}