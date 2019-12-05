package geometry;

public class Area {
    public static void main(String[] args) {
        Circle circle = new Circle(21);
        Circle circle1 = new Circle(0.67);
        System.out.println(circle.getArea());
        System.out.println(circle1.getArea());
        System.out.println(Circle.getCount());
    }
}
