package pl.put.poznan.transformer.rest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import pl.put.poznan.transformer.logic.BuildingInfo;
import pl.put.poznan.transformer.models.Building;

import java.util.Arrays;


@RestController
@RequestMapping("/{text}")
public class BuildingInfoController {

    private static final Logger logger = LoggerFactory.getLogger(BuildingInfoController.class);

    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public String get(@PathVariable String text,
                              @RequestParam(value="transforms", defaultValue="upper,escape") String[] transforms) {

        logger.debug(text);
        logger.debug(Arrays.toString(transforms));

        return text;
    }

    @RequestMapping(method = RequestMethod.POST, produces = "application/json")
    public Building post(@PathVariable String text,
                      @RequestBody Building building) {

        logger.debug(text);

        BuildingInfo buildingInfo = new BuildingInfo(building);
        return building;
    }



}


