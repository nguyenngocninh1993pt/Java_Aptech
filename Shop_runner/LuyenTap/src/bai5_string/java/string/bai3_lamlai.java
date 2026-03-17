package bai5_string.java.string;

import java.util.Scanner;

public class bai3_lamlai {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String password = "";
        while (true){
            System.out.println("Moi nhap vao mat khau: ");
            System.out.println("Mat khau phai dai toi thieu 6 ky tu, it nhat 1 chu cai va it nhat 1 chu so");
            String newPassword = sc.nextLine();
            if (checkMK(newPassword)){
                password = newPassword;
                System.out.println("Thiet lap mat khau thanh cong");
                break;
            }else{
                System.out.println("Vui long nhap lai mat khau hop le");
            }
        }
        String login = "";
        int count = 0;
        System.out.println("Moi nhap mat khau de dang nhap");
        while (true){
            login = sc.nextLine();
            if (login.equals(password)){
                System.out.println("Dang nhap thanh cong");
                break;
            }else{
                count++;
                if (count<5){
                    System.out.println("Nhap sai mat khau, vui long nhap lai, con : "+(5-count)+" lan nhap lai");
                }else{
                    System.out.println("Dang nhap da bi khoa do nhap sai qua 5 lan");
                    break;
                }
            }
        }
    }
    public static boolean checkMK(String password){
        if (password.length()<6)
            return false;
        boolean hasLetter = false;
        boolean hasDigit = false;
        for(char c: password.toCharArray()){
            if (Character.isLetter(c)){
                hasLetter = true;
            }
            if (Character.isDigit(c))
                hasDigit = true;
        }
        if (!hasDigit || !hasLetter)
            return false;
        return true;
    }
}
