package figures;

import abstraction.SpaceShape;
import vertex.Vertex;
import vertex.Vertex3D;

public class Sphere extends SpaceShape {

    Vertex vertex;
    double radius;

    public Sphere(double radius, double x, double y, double z) {
        vertex = new Vertex3D(x, y, z);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return super.toString()
                + "volume: "
                + Math.floor(getVolume())
                + " area: "
                + Math.floor(getArea())
                + " vertexXYZ: "
                + vertex.toString();
    }

    @Override
    public double getArea() {
        return 4 * Math.PI * Math.pow(getRadius(), 2);
    }

    @Override
    public double getVolume() {
        return (4 * Math.PI * Math.pow(getRadius(), 3)) / 3;
    }

    public double getRadius() {
        return radius;
    }
}