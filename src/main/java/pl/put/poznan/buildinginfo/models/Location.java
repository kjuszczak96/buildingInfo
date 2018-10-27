package pl.put.poznan.buildinginfo.models;

public class Location {
  private long id;
  private String name;
  
  public Location() {
    this.id = 1;
  }

  public long getId() {
    return id;
  }

  public String getName() {
    return name;
  }
}