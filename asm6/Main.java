package bai2_tinhtruutuong.asm6;

import java.sql.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] agrs) {
        PhoneBook pb = new PhoneBook();
        // 1. insert:
        pb.insertPhone("Nam", "0912");
        pb.insertPhone("Nam", "0913");
        pb.insertPhone("Nam", "0914");
        pb.insertPhone("Linh", "0915");
        pb.insertPhone("Nga", "0916");
        System.out.println(pb);

        // 2.remove:
        pb.removePhone("Nam");
        System.out.println(pb);

        // 3.update;
        pb.updatePhone("Linh", "0918");
        System.out.println(pb);

        // 4.search:
        pb.searchPhone("Nam");

        // 5.sort:
        pb.sort();
        System.out.println(pb);
    }
}
