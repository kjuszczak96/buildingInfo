import org.junit.Before;
import org.junit.Test;
import pl.put.poznan.buildinginfo.models.Building;
import pl.put.poznan.buildinginfo.models.Level;
import pl.put.poznan.buildinginfo.models.Room;

import static org.junit.Assert.assertTrue;


public class BuildingSortTest {

    Building building;
    Level level;
    Level level2;
    Room room1;
    Room room2;
    Room room3;

    @Before
    public void setUp(){
        building = new Building();
        level = new Level();
        level2 = new Level();
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

        Room[] rooms = {room1, room2};
        Room[] rooms2 = {room2, room3};
        level.setRooms(rooms);
        level2.setRooms(rooms2);

        Level[] levels = {level, level2};
        building.setLevels(levels);
    }

    @Test
    public void areaSortTest(){
        building.sortRooms("area");
        assertTrue(building.getLevels()[0].getRooms()[0].getArea() <= building.getLevels()[0].getRooms()[1].getArea());
    }

    @Test
    public void volumeSortTest(){
        building.sortRooms("volume");
        assertTrue(building.getLevels()[0].getRooms()[0].getVolume() <= building.getLevels()[0].getRooms()[1].getVolume());
    }

    @Test
    public void heatingSortTest(){
        building.sortRooms("heating");
        assertTrue(building.getLevels()[0].getRooms()[0].getHeatingPowerConsumption() <= building.getLevels()[0].getRooms()[1].getHeatingPowerConsumption());
    }

    @Test
    public void illuminationSortTest(){
        building.sortRooms("illumination");
        assertTrue(building.getLevels()[0].getRooms()[0].getIlluminationPower() <= building.getLevels()[0].getRooms()[1].getIlluminationPower());
    }

    @Test
    public void closestSortTest(){
        float value = 33;
        building.sortByClosestArea(value);
        float difference1 = Math.abs(building.getLevels()[0].getArea() - value);
        float difference2 = Math.abs(building.getLevels()[1].getArea() - value);
        assertTrue(difference1 <= difference2);
    }
}
