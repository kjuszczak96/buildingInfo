package pl.put.poznan.buildinginfo.interfaces;

import pl.put.poznan.buildinginfo.models.Location;

public interface Visitor {
    public void visit(Location location);
}
