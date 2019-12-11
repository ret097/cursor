package vertex;

public class Vertex2D {

    private double x;
    private double y;

    public Vertex2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "["
                + getX()
                + ";"
                + getY()
                + "] ";
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}