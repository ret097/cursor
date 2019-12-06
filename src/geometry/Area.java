package geometry;

public class Area {
    public static void main(String[] args) {
        Circle circle = new Circle(21);
        Circle circle1 = new Circle(0.67);
        System.out.println(circle.calculateArea());
        System.out.println(circle1.calculateArea());
        System.out.println(Circle.getCount());
    }
}