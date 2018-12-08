package pl.put.poznan.buildinginfo.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.web.bind.annotation.*;

import pl.put.poznan.buildinginfo.models.Location;

import java.util.List;

@RestController
public abstract class BuildingInfoController<T extends Location> {

  public static final Logger logger = LoggerFactory.getLogger(BuildingInfoController.class);

  @RequestMapping(value = "/get_area", method = RequestMethod.POST, produces = "application/json")
  public float getArea(@RequestBody T location) {
      logger.debug("User requests data of building with id = " + location.getId() + " and name = " + location.getName());
      return location.getArea();
  }

  @RequestMapping(value = "/get_volume", method = RequestMethod.POST, produces = "application/json")
  public float getVolume(@RequestBody T location) {
      logger.debug("User requests data of building with id = " + location.getId() + " and name = " + location.getName());
      return location.getVolume();
  }

  @RequestMapping(value = "/get_illumination_power", method = RequestMethod.POST, produces = "application/json")
  public float getIlluminationPower(@RequestBody T location) {
      logger.debug("User requests data of building with id = " + location.getId() + " and name = " + location.getName());
      return location.getIlluminationPower();
  }

  @RequestMapping(value = "/sortRooms", method = RequestMethod.POST, produces = "application/json")
  public T sortRooms(@RequestBody T location, @RequestParam(defaultValue = "area") String parameter) {
      logger.debug("User requests room sorting by parameter: " + parameter);
      location.sortRooms(parameter);
      return location;
  }

    @RequestMapping(value = "/sortByClosestArea", method = RequestMethod.POST, produces = "application/json")
    public T sortByClosestArea(@RequestBody T location, @RequestParam(defaultValue = "0") float area) {
        logger.debug("User requests sorting by closest area to given in input");
        location.sortByClosestArea(area);
        return location;
    }

    @RequestMapping(value = "/compareBuildings", method = RequestMethod.POST, produces = "application/json")
    public void compareBuildings(@RequestBody List<T> location) {
        logger.debug("User requests buildings comparison");
        location.get(0).compareBuildings(location.get(1));
    }
}

