package figures;

import abstraction.PlaneShape;
import vertex.Vertex;
import vertex.Vertex2D;

public class Rectangle extends PlaneShape {

    double weight;
    double height;

    public Rectangle(double weight, double height, double x, double y) {
        Vertex vertex2D = new Vertex2D(x, y);
        this.weight = weight;
        this.height = height;
    }

    @Override
    public double getArea() {
        return getWeight() * getHeight();
    }

    @Override
    public double getPerimeter() {
        return (getHeight() + getWeight() * 2);
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }
}

