package asm5_phuongtiengiaothong;

public class Plane extends Vehicle{
    public Plane(String name, double maxSpeed) {
        super(name, maxSpeed);
    }

    @Override
    public void move() {
        System.out.println("Plane is driving");;
    }
}
