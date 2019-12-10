package figures;

import abstraction.PlaneShape;
import vertex.Vertex2D;

public class Circle extends PlaneShape {

    private double radius;

    public Circle(double radius, double x, double y) {
        Vertex2D vertex = new Vertex2D(x, y);
        this.radius = radius;
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