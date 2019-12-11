package figures;

import abstraction.PlaneShape;
import vertex.Vertex2D;

public class Circle extends PlaneShape {

    private Vertex2D vertex;
    private double radius;

    public Circle(double radius, double x, double y) {
        vertex = new Vertex2D(x, y);
        this.radius = radius;
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
        return Math.pow(radius, 2) * Math.PI;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * getRadius();
    }

    public double getRadius() {
        return radius;
    }
}