import org.junit.Before;
import org.junit.Test;
import pl.put.poznan.buildinginfo.models.Building;
import pl.put.poznan.buildinginfo.models.Level;
import pl.put.poznan.buildinginfo.models.Room;

import static org.junit.Assert.assertEquals;

public class SumAndMeanTest {

    Building building;
    Level level;
    Level level2;
    Room room1;
    Room room2;
    Room room3;
    Room room4;

    @Before
    public void setUp(){
        building = new Building();
        level = new Level();
        level2 = new Level();
        room1 = new Room();
        room2 = new Room();
        room3 = new Room();
        room4 = new Room();

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
        room4.setArea((float) 7.5);
        room4.setVolume(17);
        room4.setIlluminationPower(7);
        room4.setHeatingPowerConsumption(60);

        Room[] rooms = {room1, room2};
        Room[] rooms2 = {room3, room4};
        level.setRooms(rooms);
        level2.setRooms(rooms2);

        Level[] levels = {level, level2};
        building.setLevels(levels);
    }

    @Test
    public void levelIlluminationMeanTest(){
        float illuminationMean = (room1.getIlluminationPower() + room2.getIlluminationPower())
                / (room1.getArea() + room2.getArea());
        float illuminationMean2 = (room3.getIlluminationPower() + room4.getIlluminationPower())
                / (room3.getArea() + room4.getArea());
        assertEquals(level.getIlluminationPower(), illuminationMean, 0);
        assertEquals(level2.getIlluminationPower(), illuminationMean2, 0);
    }

    @Test
    public void buildingIlluminationMeanTest(){
        float buildingMean = (level.getIlluminationPower() + level2.getIlluminationPower())
                / building.getLevels().length;
        assertEquals(building.getIlluminationPower(), buildingMean, 0);
    }

    @Test
    public void levelAreaSumTest(){
        float volumeSum1 = room1.getArea() + room2.getArea();
        float volumeSum2 = room3.getArea() + room4.getArea();
        assertEquals(level.getArea(), volumeSum1, 0);
        assertEquals(level2.getArea(), volumeSum2, 0);
    }

    @Test
    public void buildingAreaSumTest(){
        float volumeSum = level.getArea() + level2.getArea();
        assertEquals(building.getArea(), volumeSum, 0);
    }

    @Test
    public void levelVolumeSumTest(){
        float volumeSum1 = room1.getVolume() + room2.getVolume();
        float volumeSum2 = room3.getVolume() + room4.getVolume();
        assertEquals(level.getVolume(), volumeSum1, 0);
        assertEquals(level2.getVolume(), volumeSum2, 0);
    }

    @Test
    public void buildingVolumeSumTest(){
        float volumeSum = level.getVolume() + level2.getVolume();
        assertEquals(building.getVolume(), volumeSum, 0);
    }

    @Test
    public void levelHeatingSumTest(){
        float heatSum1 = room1.getHeatingPowerConsumption() + room2.getHeatingPowerConsumption();
        float heatSum2 = room3.getHeatingPowerConsumption() + room4.getHeatingPowerConsumption();
        assertEquals(level.getHeatingPowerConsumption(), heatSum1, 0);
        assertEquals(level2.getHeatingPowerConsumption(), heatSum2, 0);
    }
}
