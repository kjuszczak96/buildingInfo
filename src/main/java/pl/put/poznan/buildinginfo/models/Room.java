package pl.put.poznan.buildinginfo.models;
/** Represents a room. Allows obtaining information about the room.
 * @since 0.1
 */

public class Room extends Location {

  /** Represents room's values:
   * -area
   * -volume
   * -heating power consumption
   * -average light power per square meter
   */
  private float area;
  private float volume;
  private float heatingPowerConsumption;
  private float illuminationPower;

  /**
   * <p>Gets area of the room.</p>
   * @return A float representing total area of the room.
   */
  public float getArea() {
    return area;
  }

  /**
   * <p>Gets volume of the room.</p>
   * @return A float representing total volume of the room.
   */
  public float getVolume() {
    return volume;
  }

  public float getHeatingPowerConsumption() {
    return heatingPowerConsumption;
  }

  /**
   * <p>Gets lighting power of the room.</p>
   * @return A float representing lighting power per square meter.
   */
  public float getIlluminationPower() {
    return illuminationPower;
  }
}