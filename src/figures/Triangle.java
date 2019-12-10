package figures;

import abstraction.PlaneShape;
import vertex.Vertex2D;

public class Triangle extends PlaneShape {
    Vertex2D vertexA;
    Vertex2D vertexB;
    Vertex2D vertexC;

    public Triangle(double x, double y, double x1, double y1, double x2, double y2) {
        vertexA = new Vertex2D(x, y);
        vertexB = new Vertex2D(x1, y1);
        vertexC = new Vertex2D(x2, y2);
    }

    public double side1() {
        return Math.sqrt(
                Math.pow(vertexB.getX() - vertexA.getX(), 2) + Math.pow(vertexB.getY() - vertexA.getY(), 2));
    }

    public double side2() {
        return Math.sqrt(
                Math.pow(vertexC.getX() - vertexB.getX(), 2) + Math.pow(vertexC.getY() - vertexB.getY(), 2));
    }

    public double side3() {
        return Math.sqrt(
                Math.pow(vertexA.getX() - vertexC.getX(), 2) + Math.pow(vertexA.getY() - vertexC.getY(), 2));
    }

    @Override
    public String toString() {
        return super.toString()
                + "perimeter: "
                + Math.floor(getPerimeter())
                + " area: "
                + Math.floor(getArea())
                + " vertexXY: "
                + vertexA.toString()
                + vertexB.toString()
                + vertexC.toString();
    }

    @Override
    public double getArea() {
        double p = (side1() + side2() + side3()) / 2;
        return Math.sqrt(p * (p - side1()) * (p - side2()) * (p - side3()));
    }

    @Override
    public double getPerimeter() {
        return side1() + side2() + side3();
    }
}