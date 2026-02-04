package bai2_tinhtruutuong.asm6;

import com.sun.jdi.ArrayReference;

import java.util.ArrayList;

public class PhoneBook extends Phone {
    private ArrayList<PhoneNumber> phoneList;

    public PhoneBook() {
        this.phoneList = new ArrayList<>();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (PhoneNumber pn : phoneList) {
            sb.append(pn.getName())
                    .append(" : ")
                    .append(pn.getPhones())
                    .append("\n");
        }
        return sb.toString();
    }


    @Override
    public void insertPhone(String name, String phone) {
        for (PhoneNumber pn : phoneList) {
            if (pn.getName().equals(name)) {
                if (!pn.getPhones().contains(phone)) {
                    pn.getPhones().add(phone);
                }
                return;
            }
        }
        PhoneNumber list = new PhoneNumber(name);
        list.getPhones().add(phone);
        phoneList.add(list);
    }

    @Override
    public void removePhone(String name) {
        for (int i=0;i<phoneList.size();i++){
            if (phoneList.get(i).getName().equals(name)){
                phoneList.remove(i);
                return;
            }
        }
    }

    @Override
    public void updatePhone(String name, String newphone) {
        for (PhoneNumber pn: phoneList){
            if (pn.getName().equals(name)){
                pn.getPhones().clear();
                pn.getPhones().add(newphone);
                return;
            }
        }
    }

    @Override
    public void searchPhone(String name) {
        for (PhoneNumber pn: phoneList){
            if (pn.getName().equals(name)) {
                System.out.println(pn.getPhones());
                return;
            }
        }
        System.out.println("Khong co so dien thoai nao cua: "+name +" ton tai");
    }

    @Override
    public void sort() {
        phoneList.sort((a,b)->a.getName().compareTo(b.getName()));
    }
}

