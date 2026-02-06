package bai2_tinhtruutuong.asm7;

import java.util.ArrayList;

public class Main {
    public static void main() {
        // 1. Tao object:
        Employee[] emp = new Employee[10];
        emp[0] = new Developer("1", "Nguyen Van A", 1700000, 5);
        emp[1] = new Developer("2", "Nguyen Van B", 1700000, 10);
        emp[2] = new Developer("3", "Nguyen Van C", 1800000, 15);
        emp[3] = new Developer("4", "Nguyen Van D", 2000000, 15);
        emp[4] = new Tester("5", "Nguyen Van E", 1500000, 50);
        emp[5] = new Tester("6", "Nguyen Van F", 1500000, 30);
        emp[6] = new Tester("7", "Nguyen Van G", 1500000, 100);
        emp[7] = new Tester("8", "Nguyen Van H", 1500000, 50);
        emp[8] = new Tester("9", "Nguyen Van I", 1500000, 50);
        emp[9] = new Manager("10", "Nguyen Van K", 3000000, 10);
        for (Employee e: emp){
            if (e.getPosition().equals("Developer")||e.getPosition().equals("Manager")){
                BonusEligible b = (BonusEligible) e;
                System.out.println(e+" Tien thuong: "+b.calculateBonus());
            }else{
                System.out.println(e);
            }
        }
        // 2. Tinh tong luong va tong thuong:
        // 2.1 Tinh tong thuong:
        double tongThuong = 0;

        for (Employee e : emp) {
            if (e instanceof BonusEligible) {  // kiem tra neu e thuoc kieu du lieu BonusEligible (hoac lop BonusEligible)
//                hay khong? chinh la = dieu kien Developer va Manager thi co thuong, vi: 2 class nay implement tu interface
//                BonusEligible b = (BonusEligible) e;  // phai ep kieu xuong BonusEligible de su dung method calculateBonus()?
                // vi thang e instanceof Employee khong co method calculateBonus() nay, phai ep kieu xuong
                tongThuong += ((BonusEligible)e).calculateBonus();
            }
        }
        System.out.println("Tong thuong la: "+ tongThuong);

        // 2.2 Tinh tong luong:
        double tongLuong = 0;
        for (Employee e: emp){
            tongLuong+=e.calculateSalary();
        }
        System.out.println("Tong luong la: "+ tongLuong);
    }
}
