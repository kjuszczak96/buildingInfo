package pl.put.poznan.buildinginfo.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;

import pl.put.poznan.buildinginfo.models.Location;

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
}

