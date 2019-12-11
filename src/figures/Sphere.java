package figures;

import abstraction.SpaceShape;
import vertex.Vertex3D;

public class Sphere extends SpaceShape {

    private Vertex3D vertex;
    private double radius;

    public Sphere(double radius, double x, double y, double z) {
        vertex = new Vertex3D(x, y, z);
        getVertex3DList().add(vertex);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return super.toString()
                + "volume: "
                + Math.floor(calculateVolume())
                + " area: "
                + Math.floor(calculateArea())
                + " vertexXYZ: "
                + vertex.toString();
    }

    @Override
    public double calculateArea() {
        return 4 * Math.PI * Math.pow(getRadius(), 2);
    }

    @Override
    public double calculateVolume() {
        return (4 * Math.PI * Math.pow(getRadius(), 3)) / 3;
    }

    public double getRadius() {
        return radius;
    }
}