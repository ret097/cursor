package figures;

import abstraction.PlaneShape;
import vertex.Vertex2D;

public class Triangle extends PlaneShape {
    private Vertex2D vertexA;
    private Vertex2D vertexB;
    private Vertex2D vertexC;

    public Triangle(double x, double y, double x1, double y1, double x2, double y2) {
        vertexA = new Vertex2D(x, y);
        vertexB = new Vertex2D(x1, y1);
        vertexC = new Vertex2D(x2, y2);
        getVertex2DList().add(vertexA);
        getVertex2DList().add(vertexB);
        getVertex2DList().add(vertexC);
    }

    public double sideA() {
        return Math.sqrt(
                Math.pow(vertexB.getX() - vertexA.getX(), 2) + Math.pow(vertexB.getY() - vertexA.getY(), 2));
    }

    public double sideB() {
        return Math.sqrt(
                Math.pow(vertexC.getX() - vertexB.getX(), 2) + Math.pow(vertexC.getY() - vertexB.getY(), 2));
    }

    public double sideC() {
        return Math.sqrt(
                Math.pow(vertexA.getX() - vertexC.getX(), 2) + Math.pow(vertexA.getY() - vertexC.getY(), 2));
    }

    @Override
    public String toString() {
        return super.toString()
                + "perimeter: "
                + Math.floor(calculatePerimeter())
                + " area: "
                + Math.floor(calculateArea())
                + " vertexXY: "
                + vertexA.toString()
                + vertexB.toString()
                + vertexC.toString();
    }

    @Override
    public double calculateArea() {
        double p = (sideA() + sideB() + sideC()) / 2;
        return Math.sqrt(p * (p - sideA()) * (p - sideB()) * (p - sideC()));
    }

    @Override
    public double calculatePerimeter() {
        return sideA() + sideB() + sideC();
    }
}