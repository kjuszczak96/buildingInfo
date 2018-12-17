import org.junit.Before;
import org.junit.Test;
import pl.put.poznan.buildinginfo.models.Room;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    Room room;

    @Before
    public void setUp(){
        room = new Room();
        room.setArea((float)25);
        room.setVolume((float)60);
        room.setHeatingPowerConsumption((float)120);
        room.setIlluminationPower((float)12);
    }

    @Test
    public void areaTest(){
        assertEquals(room.getArea(), (float) 25, (float) 0);
    }

    @Test
    public void volumeTest(){
        assertEquals(room.getVolume(), (float) 60, (float) 0);
    }

    @Test
    public void heatTest(){
        assertEquals(room.getHeatingPowerConsumption(), (float) 120, (float) 0);
    }

    @Test
    public void illuminationTest(){
        assertEquals(room.getIlluminationPower(), (float) 12, (float) 0);
    }
}
