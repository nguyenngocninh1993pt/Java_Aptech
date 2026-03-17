package bai5_string.java.string;

public class java_baitapvandung2 {
    public static void main(String[] args) {
        String str1 = "English = 78 Science = 83 Math = 68 History = 65";
        int sum = 0; // Bien tinh tong;
        int count = 0; // Bien luu so luong so;

        // Tach chuoi bang split:
        String[] parts = str1.split(" ");
        for (String pt: parts){
            System.out.println(pt);
            try{
                int num = Integer.parseInt(pt);
                sum+=num;
                count++;
            }catch(NumberFormatException e){
                // chi don gian la khong lam gi neu k ep duoc kieu int;
            }
        }
        // tinh trung binh cong;
        double tbc = (double) sum/count;
        System.out.println("Tong cac so trong chuoi la: "+sum);
        System.out.println("Trung binh cong trong chuoi la: "+tbc);
    }
}
