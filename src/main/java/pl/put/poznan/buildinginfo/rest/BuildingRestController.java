package pl.put.poznan.buildinginfo.rest;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import pl.put.poznan.buildinginfo.models.Building;

@RestController
@RequestMapping("/building")
public class BuildingRestController extends BuildingInfoController<Building> {}
