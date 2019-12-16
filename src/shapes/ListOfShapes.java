package shapes;

import figures.*;

public class ListOfShapes {
    public void printShapes(){
        Circle circle = new Circle(5, 3, 5);
        Cuboid cuboid = new Cuboid(5, 5, 9, 3, 6, 4);
        Rectangle rectangle = new Rectangle(7, 5, 4, 5);
        Sphere sphere = new Sphere(5, 3, 5, 6);
        SquarePyramid squarePyramid = new SquarePyramid(10, 5, 1, 1, 1);
        Triangle triangle = new Triangle(1, 0, 3, 6, 6, 0);
        Shape[] shapes = {circle, rectangle, triangle, sphere, cuboid, squarePyramid};
        for (Shape shape : shapes) {
            System.out.println(shape.toString());
        }
    }
}
