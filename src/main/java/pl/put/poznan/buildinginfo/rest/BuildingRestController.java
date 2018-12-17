package pl.put.poznan.buildinginfo.rest;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import pl.put.poznan.buildinginfo.models.Building;

/**
 * Representation of a spring REST controller for Buildings.
 * 
 * @since 0.2
 * @see BuildingInfoController
 * @see Building
 */
@RestController
@RequestMapping("/building")
public class BuildingRestController extends BuildingInfoController<Building> {}
