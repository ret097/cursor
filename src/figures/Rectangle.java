package figures;

import shapes.PlaneShape;
import vertex.Vertex2D;

public class Rectangle extends PlaneShape {

    private Vertex2D vertex;

    private double width;
    private double height;

    public Rectangle(double width, double height, double x, double y) {
        vertex = new Vertex2D(x, y);
        getVertex2DList().add(vertex);
        this.width = width;
        this.height = height;
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
        return getWidth() * getHeight();
    }

    @Override
    public double calculatePerimeter() {
        return (getHeight() + getWidth() * 2);
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}