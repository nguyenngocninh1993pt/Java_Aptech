package bai5_string.java.string;

import java.util.Scanner;

public class java_baitapvandung1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap 1 chuoi: ");
        String s = sc.next();
        System.out.println(s);
        int demSo = 0;
        int demInThuong = 0;
        int demInHoa = 0;
        int demSpace = 0;
        System.out.println(s.length());
        for (int i =0;i < s.length();i++) {
            char c = s.charAt(i);
            if (Character.isLowerCase(c))
                demInThuong++;
            else if (Character.isUpperCase(c))
                demInHoa++;
            else if (Character.isWhitespace(c))
                demSpace++;
        }
            System.out.println("So ky tu in thuong: "+demInThuong+" So ky tu in hoa: "+demInHoa+" So ky tu khoang trang: "+demSpace);
    }
}

