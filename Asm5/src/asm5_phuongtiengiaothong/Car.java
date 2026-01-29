package asm5_phuongtiengiaothong;

public class Car extends Vehicle{
    public Car(String name, double maxSpeed) {
        super(name, maxSpeed);
    }

    @Override
    public void move() {
        System.out.println("Car is driving");
    }
}
