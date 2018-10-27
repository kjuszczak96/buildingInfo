package pl.put.poznan.buildinginfo.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import pl.put.poznan.buildinginfo.models.Location;

@RestController
public class BuildingInfoController {

  private static final Logger logger = LoggerFactory.getLogger(BuildingInfoController.class);

  @RequestMapping(value = "/get_building", method = RequestMethod.GET, produces = "application/json")
  public void get(@RequestParam(value="id") long id) {
    logger.debug("User requests data of building with id = " + Long.toString(id));
  }

  @RequestMapping(value = "/add_building", method = RequestMethod.POST, produces = "application/json")
  public Location post(@RequestBody Location building) {
    logger.debug("User attempting to add new building with name = " + building.getName() + ", id = " + building.getId());

    return building;
  }
}
