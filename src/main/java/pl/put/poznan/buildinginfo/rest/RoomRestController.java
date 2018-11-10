package pl.put.poznan.buildinginfo.rest;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import pl.put.poznan.buildinginfo.models.Room;

@RestController
@RequestMapping("/room")
public class RoomRestController extends BuildingInfoController<Room> {}
