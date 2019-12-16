package shapes;

import interfaces.AreaMeasurable;
import interfaces.PerimeterMeasurable;
import vertex.Vertex2D;

import java.util.ArrayList;
import java.util.List;

public abstract class PlaneShape extends Shape implements PerimeterMeasurable, AreaMeasurable {
    List<Vertex2D> vertex2DList = new ArrayList<>();

    public List<Vertex2D> getVertex2DList() {
        return vertex2DList;
    }

}