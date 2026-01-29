package asm5_quanlynhansu;

public class PartTimeEmployee extends Employee{
    private double hourSalary;
    private double hour;
    public PartTimeEmployee(String name, String id, double hourSalary, double hour) {
        super(name, id);
        this.hourSalary = hourSalary;
        this.hour = hour;
    }

    public double getHourSalary() {
        return hourSalary;
    }

    public double getHour() {
        return hour;
    }

    public void setHourSalary(double hourSalary) {
        this.hourSalary = hourSalary;
    }
    @Override
    public double getSalary() {
        return getHourSalary()* getHour();
    }
}
