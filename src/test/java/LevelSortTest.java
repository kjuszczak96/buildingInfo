import org.junit.Before;
import org.junit.Test;
import pl.put.poznan.buildinginfo.models.Building;
import pl.put.poznan.buildinginfo.models.Level;
import pl.put.poznan.buildinginfo.models.Room;

import static org.junit.Assert.assertTrue;


public class LevelSortTest {

    Level level;
    Room room1;
    Room room2;
    Room room3;

    @Before
    public void setUp(){
        level = new Level();
        room1 = new Room();
        room2 = new Room();
        room3 = new Room();

        room1.setArea(20);
        room1.setVolume(40);
        room1.setIlluminationPower(10);
        room1.setHeatingPowerConsumption(120);
        room2.setArea(10);
        room2.setVolume(20);
        room2.setIlluminationPower(7);
        room2.setHeatingPowerConsumption(80);
        room3.setArea(15);
        room3.setVolume(30);
        room3.setIlluminationPower(7);
        room3.setHeatingPowerConsumption(100);

        Room[] rooms = {room1, room2, room3};
        level.setRooms(rooms);
    }

    @Test
    public void areaSortTest(){
        level.sortRooms("area");
        assertTrue(level.getRooms()[0].getArea() <= level.getRooms()[1].getArea());
    }

    @Test
    public void volumeSortTest(){
        level.sortRooms("volume");
        assertTrue(level.getRooms()[0].getVolume() <= level.getRooms()[1].getVolume());
    }

    @Test
    public void heatingSortTest(){
        level.sortRooms("heating");
        assertTrue(level.getRooms()[0].getHeatingPowerConsumption() <= level.getRooms()[1].getHeatingPowerConsumption());
    }

    @Test
    public void illuminationSortTest(){
        level.sortRooms("illumination");
        assertTrue(level.getRooms()[0].getIlluminationPower() <= level.getRooms()[1].getIlluminationPower());
    }

    @Test
    public void closestSortTest(){
        float value = 33;
        level.sortByClosestArea(value);
        float difference1 = Math.abs(level.getRooms()[0].getArea() - value);
        float difference2 = Math.abs(level.getRooms()[1].getArea() - value);
        float difference3 = Math.abs(level.getRooms()[2].getArea() - value);
        assertTrue(difference1 <= difference2 && difference2 <= difference3);
    }
}
