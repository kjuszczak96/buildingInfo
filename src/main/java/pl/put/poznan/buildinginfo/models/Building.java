package pl.put.poznan.buildinginfo.models;
/** Represents a building. Allows calculating and obtaining information about the building.
 * @since 0.1
 */

public class Building extends Location {

  /** Represents list of levels the building consists of.
   */
  private Level[] levels;

  /**
   * <p>Gets list of levels that building consists of.</p>
   * @return A float representing total area of the building.
   */
  public Level[] getLevels() {
    return levels;
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
}