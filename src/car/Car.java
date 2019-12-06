package car;

public class Car {
    private double speed;
    private double time;
    private boolean motor;

    public void run() {
        if (!isMotorOn()) {
            setMotorOn(true);
            System.out.println("Motor is started");
        }
    }

    public void shutDown() {
        if (isMotorOn()) {
            setMotorOn(false);
            System.out.println("Motor is off");
        }
    }

    public double getDistance() {
        return getSpeed() * getTime();
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public boolean isMotorOn() {
        return motor;
    }

    public void setMotorOn(boolean motor) {
        this.motor = motor;
    }
}