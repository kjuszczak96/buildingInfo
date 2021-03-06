package pl.put.poznan.buildinginfo.models;

import pl.put.poznan.buildinginfo.interfaces.Visitable;
import pl.put.poznan.buildinginfo.interfaces.Visitor;

import java.util.Arrays;

/** Represents a building. Allows calculating and obtaining information about the building.
 * @since 0.1
 */

public class Building extends Location implements Visitable {

    /** Represents list of levels the building consists of.
   */
  private Level[] levels;

  public void setLevels(Level[] levels) {
      this.levels = levels;
  }
  /**
   * <p>Gets list of levels that building consists of.</p>
   * @return A float representing total area of the building.
   */
  public Level[] getLevels() {
    return levels;
  }

  /**
   * <p>Visitor method.</p>
   */
  @Override
  public void accept(Visitor visitor){
      visitor.visit(this);
  }

  /**
   * <p>Gets total area of the building.</p>
   * @return A float representing total area of the building.
   */
  public float getArea() {
    float area = 0;
    for(int i = 0; i < levels.length; i++)
    {
      area = area + levels[i].getArea();
    }
    return area;
  }

  /**
   * <p>Gets total volume of the building.</p>
   * @return A float representing total volume of the building.
   */
  public float getVolume() {
    float totalVolume = 0;
    for (Level level : levels) {
      totalVolume += level.getVolume();
    }
    return totalVolume;
  }

  /**
   * <p>Gets lighting power of the building.</p>
   * @return A float representing lighting power per square meter.
   */
  public float getIlluminationPower() {
    float power = 0;
    for (int i = 0; i < levels.length; i++)
      power += levels[i].getIlluminationPower();
    power = power / levels.length;
    return power;
  }

    @Override
    public void compareBuildings(Location otherBuilding) {
      System.out.println("First building name: " + this.getName() + " other building name: " + otherBuilding.getName());
      System.out.println("Area: " + this.getArea() + " other building: " + otherBuilding.getArea());
      System.out.println("Volume: " + this.getVolume() + " other building: " + otherBuilding.getVolume());
      System.out.println("Illumination Power: " + this.getIlluminationPower() + " other building: " + otherBuilding.getIlluminationPower());
    }


    @Override
    public void sortRooms(String parameter) {
      if(levels == null){
          System.out.println("Rooms are null");
      }
      else {
          for(Level level : levels){
              level.sortRooms(parameter);
          }

          switch (parameter) {
              case "area":
                  Arrays.sort(levels, (o1, o2) -> Float.compare(o1.getArea(), o2.getArea()));
                  break;
              case "volume":
                  Arrays.sort(levels, (o1, o2) -> Float.compare(o1.getVolume(), o2.getVolume()));
                  break;
              case "heating":
                  Arrays.sort(levels, (o1, o2) -> Float.compare(o1.getHeatingPowerConsumption(), o2.getHeatingPowerConsumption()));
                  break;
              case "illumination":
                  Arrays.sort(levels, (o1, o2) -> Float.compare(o1.getIlluminationPower(), o2.getIlluminationPower()));
                  break;
          }

          System.out.println("----------");
          for (Level level : levels) {
              System.out.println(level.getName());
          }
      }
  }

    public void sortByClosestArea(float area) {
        if (levels == null) {
            System.out.println("Rooms are null");
        } else {
            Arrays.sort(levels, (o1, o2) -> Float.compare(Math.abs(o1.getArea() - area), Math.abs(o2.getArea() - area)));
            for (Level level : levels) {
                System.out.println(level.getName() + " the difference from given area = " + Math.abs(level.getArea() - area));
            }
        }
    }
}