package figures;

import abstraction.PlaneShape;
import vertex.Vertex2D;

public class Circle extends PlaneShape {

    private Vertex2D vertex;
    private double radius;

    public Circle(double radius, double x, double y) {
        vertex = new Vertex2D(x, y);
        getVertex2DList().add(vertex);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return super.toString()
                + "perimeter: "
                + Math.floor(calculatePerimeter())
                + " area: "
                + Math.floor(calculateArea())
                + " vertexXY: "
                + vertex.toString();
    }

    @Override
    public double calculateArea() {
        return Math.pow(radius, 2) * Math.PI;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * getRadius();
    }

    public double getRadius() {
        return radius;
    }
}