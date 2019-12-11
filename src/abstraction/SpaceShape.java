package abstraction;

import interfaces.AreaMeasurable;
import interfaces.VolumeMeasurable;
import vertex.Vertex3D;

import java.util.ArrayList;
import java.util.List;

public abstract class SpaceShape extends Shape implements AreaMeasurable, VolumeMeasurable {

    List<Vertex3D> vertex3DList = new ArrayList<>();

    public List<Vertex3D> getVertex3DList() {
        return vertex3DList;
    }
}