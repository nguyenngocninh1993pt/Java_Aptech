package asm5_quanlynhansu;

public class Main {
    public static void main(String[] agrs) {
        Employee e1 = new FullTimeEmployee("Nguyễn Văn A", "a123", 10000000);
        System.out.println("Thông tin nhân viên fulltime: " + "Tên: " + e1.getName() + " id: " + e1.getId() + " Lương: " + e1.getSalary());
        Employee e2 = new PartTimeEmployee("Nguyễn Văn B", "a122", 200000, 8);
        System.out.println("Thông tin nhân viên partime: " + "Tên: " + e2.getName() + " id: " + e2.getId() + " Lương: " + e2.getSalary());
    } // Đa hình ở chỗ Employee e1 nhưng new lại ở Class FullTimeEmployee;
}
