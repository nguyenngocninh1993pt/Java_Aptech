package bai2_tinhtruutuong.asm6;

import java.util.ArrayList;

public class PhoneNumber{
    private String name;
    private ArrayList<String> phones;

    public PhoneNumber(String name){
        this.name = name;
        this.phones = new ArrayList<>();
    }
    public String getName(){
        return name;
    }
    public ArrayList<String> getPhones(){

        return phones;
    }
}
