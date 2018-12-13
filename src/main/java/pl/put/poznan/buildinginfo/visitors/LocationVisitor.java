package pl.put.poznan.buildinginfo.visitors;

import pl.put.poznan.buildinginfo.interfaces.Visitor;
import pl.put.poznan.buildinginfo.models.Location;

public class LocationVisitor implements Visitor {

    private float totalArea;

    @Override
    public void visit(Location location) {
        totalArea = location.getArea();
    }

    public float getTotalArea(){
        return totalArea;
    }
}
