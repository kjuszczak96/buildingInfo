package pl.put.poznan.buildingInfo.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import pl.put.poznan.buildingInfo.logic.Building;

import java.util.Arrays;
import java.util.Random;

@RestController
public class ObjectController {

    private static final Logger logger = LoggerFactory.getLogger(ObjectController.class);

    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public Building get(@RequestParam(value="name", defaultValue = "Building") String name) {

        int randomId = Math.abs(new Random().nextInt());
        Building building = new Building(randomId, name);

        logger.debug("Requested object - returning object with id: " + Integer.toString(building.getId()) + " " + building.getName());

        //Return requested object
        return building;
    }

    @RequestMapping(method = RequestMethod.POST, produces = "application/json")
    public void post(@RequestBody Building building) {
        logger.debug("Adding building: " + building.getId() + " " + building.getName());
    }
}
