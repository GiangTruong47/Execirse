package B3;

public class EX2 {
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public EX2() {
        this.speed = SLOW;
        this.on = false;
        this.radius = 5.0;
        this.color = "blue";
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        if (on) {
            return "Fan is on [speed = " + speed + ", color = " + color + ", radius = " + radius + "]";
        } else {
            return "Fan is off [color = " + color + ", radius = " + radius + "]";
        }
    }

    public static void main(String[] args) {
        EX2 fan = new EX2();
        fan.setSpeed(FAST);
        fan.setRadius(5);
        fan.setColor("yellow");
        fan.setOn(true);

        EX2 fan1 = new EX2();
        fan1.setSpeed(MEDIUM);
        fan1.setRadius(5);
        fan1.setColor("blue");
        fan1.setOn(false);

        System.out.println("Fan : " + fan.toString());
        System.out.println("Fan1 : " + fan1.toString());

    }
}

