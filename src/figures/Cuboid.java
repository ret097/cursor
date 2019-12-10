package figures;

import abstraction.SpaceShape;
import vertex.Vertex;
import vertex.Vertex3D;

public class Cuboid extends SpaceShape {

    Vertex vertex;
    double width;
    double height;
    double depth;

    public Cuboid(double width, double height, double depth, double x, double y, double z) {
        vertex = new Vertex3D(x, y, z);
        this.width = width;
        this.height = height;
        this.depth = depth;
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
        return (getWidght() * getHeight() + getWidght() * getDepth() + getHeight() * getDepth() * 2);
    }

    @Override
    public double getVolume() {
        return getHeight() * getWidght() * getDepth();
    }

    public double getWidght() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getDepth() {
        return depth;
    }
}