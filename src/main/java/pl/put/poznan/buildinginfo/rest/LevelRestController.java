package pl.put.poznan.buildinginfo.rest;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import pl.put.poznan.buildinginfo.models.Level;

@RestController
@RequestMapping("/level")
public class LevelRestController extends BuildingInfoController<Level> {}
