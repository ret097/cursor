package figures;

import abstraction.SpaceShape;
import vertex.Vertex;
import vertex.Vertex3D;

public class SquarePyramid extends SpaceShape {

    Vertex vertex;
    double height;
    double width;

    public SquarePyramid(double height, double width, double x, double y, double z) {
        vertex = new Vertex3D(x, y, z);
        this.height = height;
        this.width = width;
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
        return getBaseArea() + getSideArea();
    }

    @Override
    public double getVolume() {
        return (getBaseArea() * getHeight()) / 3;
    }

    public double getSideArea() {
        return (getPerimeter() * getApophema()) / 2;
    }

    public double getApophema() {
        return Math.sqrt(Math.pow(getWidth() / 2, 2)
                + Math.pow(getHeight(), 2));
    }

    public double getBaseArea() {
        return getWidth() * getWidth();
    }

    public double getPerimeter() {
        return 4 * getWidth();
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }
}