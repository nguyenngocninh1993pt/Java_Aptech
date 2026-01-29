package asm5_phuongtiengiaothong;

public class Main {
    public static void main(String[] agrs){
        Vehicle[] vehicles = new Vehicle[4];
        vehicles[0] = new Car("Toyota", 240);
        vehicles[1] = new Bike("Xe đạp Big4", 50);
        vehicles[2] = new Train("Tàu hỏa", 150);
        vehicles[3] = new Plane("Airbus 320", 1200);
        for(Vehicle v: vehicles){
            v.move();
        }
    }
}
