package figures;

import shapes.SpaceShape;
import vertex.Vertex3D;

public class Cuboid extends SpaceShape {

    private Vertex3D vertex;
    private double width;
    private double height;
    private double depth;

    public Cuboid(double width, double height, double depth, double x, double y, double z) {
        vertex = new Vertex3D(x, y, z);
        getVertex3DList().add(vertex);
        this.width = width;
        this.height = height;
        this.depth = depth;
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
        return (getWidth() * getHeight() + getWidth() * getDepth() + getHeight() * getDepth() * 2);
    }

    @Override
    public double calculateVolume() {
        return getHeight() * getWidth() * getDepth();
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getDepth() {
        return depth;
    }
}