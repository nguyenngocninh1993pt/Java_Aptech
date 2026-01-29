package asm5_quanlynhansu;

public class FullTimeEmployee extends Employee{
    private double fixSalary;

    public FullTimeEmployee(String name, String id, double fixSalary) {
        super(name, id);
        this.fixSalary = fixSalary;
    }

    public double getFixSalary() {
        return fixSalary;
    }

    public void setFixSalary(double fixSalary) {
        this.fixSalary = fixSalary;
    }

    @Override
    public double getSalary() {
        return getFixSalary();
    }
}
