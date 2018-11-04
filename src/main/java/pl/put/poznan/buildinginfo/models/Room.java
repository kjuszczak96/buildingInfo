package pl.put.poznan.buildinginfo.models;

public class Room extends Location {
  private float area;
  private float volume;
  private float heatingPowerConsumption;
  private float illuminationPower;

  public float getArea() {
    return area;
  }

  public float getVolume() {
    return volume;
  }

  public float getHeatingPowerConsumption() {
    return heatingPowerConsumption;
  }

  public float getIlluminationPower() {
    return illuminationPower;
  }
}