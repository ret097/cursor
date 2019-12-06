package geometry;

public class Circle {
    private static int count;
    double radius;

    public Circle(double radius) {
        this.radius = radius;
        count++;
    }

    public double calculateArea() {

        return Math.pow(radius, 2) * Math.PI;
    }

    public static int getCount() {
        return count;
    }
}
