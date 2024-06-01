package BT6;

import java.util.*;

public class PhoneBook extends Phone {
    TreeMap<String, ArrayList<String>> PhoneList;

    public PhoneBook() {
        PhoneList = new TreeMap<>();
    }

    public TreeMap<String, ArrayList<String>> getPhoneList() {
        return PhoneList;
    }

    @Override
    public void insertPhone(String name, String phone) {
        if (PhoneList.get(name) == null)
            PhoneList.put(name, new ArrayList<>());

        PhoneList.get(name).add(phone);
    }

    @Override
    public void removePhone(String name) {
        PhoneList.put(name, null);
    }

    @Override
    public String searchPhone(String name) {
        return PhoneList.get(name).toString().replaceAll(",", ":");
    }

    @Override
    public void sort() {

    }

    @Override
    public void updatePhone(String name, String phone) {
        PhoneList.get(name).clear();
        insertPhone(name, phone);
    }
}
