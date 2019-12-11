package figures;

import abstraction.PlaneShape;
import vertex.Vertex2D;

public class Rectangle extends PlaneShape {

    private Vertex2D vertex;

    private double width;
    private double height;

    public Rectangle(double width, double height, double x, double y) {
        vertex = new Vertex2D(x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return super.toString()
                + "perimeter: "
                + Math.floor(getPerimeter())
                + " area: "
                + Math.floor(getArea())
                + " vertexXY: "
                + vertex.toString();
    }

    @Override
    public double getArea() {
        return getWidth() * getHeight();
    }

    @Override
    public double getPerimeter() {
        return (getHeight() + getWidth() * 2);
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}