package shapes;

public abstract class Shape {

    @Override
    public String toString() {
        return getClass().getSuperclass().getSimpleName()
                + "-figure-"
                + getClass().getSimpleName()
                + ": ";
    }
}