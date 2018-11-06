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
    float power = 0;
    for (int i = 0; i < rooms.length; i++)
      power += rooms[i].getIlluminationPower();
    return power;
  }
}