package bai2_tinhtruutuong.asm7;

public class Developer extends Employee implements BonusEligible{
    private int overtimeHours;

    public Developer(String id, String name, double baseSalary, int overtimeHours) {
        super(id, name, baseSalary);
    }

    public int getOvertimeHours() {
        return overtimeHours;
    }

    public void setOvertimeHours(int overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    @Override
    public double calculateBonus() {
        return getBaseSalary()*20/100;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + getOvertimeHours()*50000;
    }

    @Override
    public String getPosition() {
        return "Developer";
    }

    @Override
    public void showInfo() {

    }

    @Override
    public String toString() {
        return super.toString() + calculateBonus();
    }
}
