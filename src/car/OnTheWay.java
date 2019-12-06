package car;

public class OnTheWay {
    public static void main(String[] args) {
        Car car = new Car();
        car.run();
        car.setSpeed(69);
        car.setTime(25.15);
        car.shutDown();
        System.out.println("This car is imaginary and traveled "
                + car.getDistance()
                + " km in space");
    }
}