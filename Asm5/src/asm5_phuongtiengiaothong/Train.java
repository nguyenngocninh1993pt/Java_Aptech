package asm5_phuongtiengiaothong;

public class Train extends Vehicle{
    public Train(String name, double maxSpeed) {
        super(name, maxSpeed);
    }

    @Override
    public void move() {
        System.out.println("Train is driving");;
    }
}
