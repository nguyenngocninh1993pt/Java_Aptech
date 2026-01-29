package asm5_phuongtiengiaothong;

public class Vehicle {
    private String name;
    private double maxSpeed;

    public Vehicle() {
    }

    public Vehicle(String name, double maxSpeed) {
        this.name = name;
        this.maxSpeed = maxSpeed;
    }

    public String getName() {
        return name;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    public void move(){
        System.out.println("Vehicle is moving");
    }
}
