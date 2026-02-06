package bai2_tinhtruutuong.asm7;

public class Tester extends Employee{
    private int bugsFound;

    public Tester(String id, String name, double baseSalary, int bugsFound) {
        super(id, name, baseSalary);
    }

    public int getBugsFound() {
        return bugsFound;
    }

    public void setBugsFound(int bugsFound) {
        this.bugsFound = bugsFound;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + getBugsFound()*30000;
    }

    @Override
    public String getPosition() {
        return "Tester";
    }

    @Override
    public void showInfo() {

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
