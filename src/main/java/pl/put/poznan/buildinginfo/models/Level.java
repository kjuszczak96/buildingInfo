package pl.put.poznan.buildinginfo.models;
/** Represents a building level. Allows calculating and obtaining information about the level.
 * @since 0.1
*/
public class Level extends Location {

  /** Represents list of rooms that level consists of.
  */
  private Room[] rooms;

  /**
  * <p>Gets list of rooms that level consists of.</p>
  * @return A float representing total area of all rooms that level consists of.
  */
  public Room[] getRooms() {
    return rooms;
  }
  /**
  * <p>Gets total area of level.</p>
  * @return A float representing total area of all rooms that level consists of.
  */
  public float getArea() {
    float area = 0;
    for(int i = 0; i < rooms.length; i++)
    {
      area = area + rooms[i].getArea();
    }
    return area;
  }

  /**
  * <p>Gets total volume of level.</p>
  * @return A float representing total volume of all rooms that level consists of.
  */
  public float getVolume() {
    float totalVolume = 0;
    for (Room room : rooms) {
      totalVolume += room.getVolume();
    }
    return totalVolume;
  }

  /**
  * <p>Gets lighting power of level.</p>
  * @return A float representing lighting power per square meter.
  */
  public float getIlluminationPower() {
    float power = 0;
    for (int i = 0; i < rooms.length; i++)
      power += rooms[i].getIlluminationPower();
    float area = getArea();
    power = power / area;
    return power;
  }
}