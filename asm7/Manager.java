package bai2_tinhtruutuong.asm7;

public class Manager extends Employee implements BonusEligible{
    private int teamSize;

    public Manager(String id, String name, double baseSalary, int teamSize) {
        super(id, name, baseSalary);
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    @Override
    public double calculateBonus() {
        return getBaseSalary() * 30/100;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + getTeamSize()*1000000;
    }

    @Override
    public String getPosition() {
        return "Manager";
    }

    @Override
    public void showInfo() {

    }

    @Override
    public String toString() {
        return super.toString() + calculateBonus();
    }
}
