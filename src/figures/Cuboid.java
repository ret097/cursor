package figures;

import abstraction.SpaceShape;
import vertex.Vertex;
import vertex.Vertex3D;

public class Cuboid extends SpaceShape {

    double weight;
    double height;
    double depth;

    public Cuboid(double weight, double height, double depth, double x, double y, double z) {
        Vertex vertex3D = new Vertex3D(x, y, z);
        this.weight = weight;
        this.height = height;
        this.depth = depth;
    }

    @Override
    public double getArea() {
        return (getWeight() * getHeight() + getWeight() * getDepth() + getHeight() * getDepth() * 2);
    }

    @Override
    public double getVolume() {
        return getHeight() * getWeight() * getDepth();
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public double getDepth() {
        return depth;
    }
}
