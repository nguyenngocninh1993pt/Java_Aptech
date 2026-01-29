package asm5_phuongtiengiaothong;

public class Bike extends Vehicle{
    public Bike(String name, double maxSpeed) {
        super(name, maxSpeed);
    }

    @Override
    public void move() {
        System.out.println("Bike is driving");;
    }
}
