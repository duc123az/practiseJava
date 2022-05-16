package Homework.Buoi6;

import java.util.Scanner;

public class Store extends SmartPhone {
    private String nameStore;
    private String addressStore;
    private int totalPhone; //tổng số điện thoại có trong cửa hàng
    SmartPhone[] phones; //chứa các điện thoại có trong cửa hàng

    public Store() {};

    public Store(String nameStore, String addressStore, int totalPhone) {
        this.nameStore = nameStore;
        this.addressStore = addressStore;
        this.totalPhone = totalPhone;
        this.phones = new SmartPhone[totalPhone];
    }

    public String getNameStore() {
        return nameStore;
    }

    public void setNameStore(String nameStore) {
        this.nameStore = nameStore;
    }

    public String getAddressStore() {
        return addressStore;
    }

    public void setAddressStore(String addressStore) {
        this.addressStore = addressStore;
    }

    public int getTotalPhone() {return totalPhone;}

    public void setTotalPhone(int totalPhone) {

        this.totalPhone = totalPhone;
    }

    public SmartPhone[] getPhones() {
        for (int i = 0; i < totalPhone; i++) {
            Scanner scr = new Scanner(System.in);
            System.out.print("Nhập branch: ");
            String branch = scr.nextLine();

            System.out.print("Buetooth (true/false)? ");
            boolean hasBuetooth = scr.nextBoolean();

            System.out.print("5G (true/false)? ");
            boolean has5G = scr.nextBoolean();

            System.out.print("Wifi (true/false)? ");
            boolean hasWifi = scr.nextBoolean();

            System.out.print("Os bao nhiêu (vd: Os15): ");
            String os = scr.nextLine();

            System.out.print("Bộ nhớ bao nhiêu: ");
            float memory = scr.nextFloat();

            scr.nextLine();

            System.out.print("Màu gì: ");
            String color = scr.nextLine();

            System.out.print("Giá bao nhiêu: ");
            long price = scr.nextLong();

            System.out.print("Số lượng bao nhiêu: ");
            int totalSold = scr.nextInt();

            scr.nextLine();

            SmartPhone phone = new SmartPhone(branch, hasBuetooth, has5G, hasWifi, os, memory, color, price, totalSold);
            phones[i] = phone;
        }
        return phones;
    }

    public void setPhones(SmartPhone[] phones) {
        this.phones = phones;
    }

    long totalPrice = 0;

    public int totalPhoneSold() {
        int n = 0;
        for (int i = 0; i < phones.length; i++) {
            if(phones[i].getTotalSold() > 0) {
                n += phones[i].getTotalSold();
                totalPrice = phones[i].getTotalSold() * phones[i].getPrice();
            }
        }
        return n;
    }

    public long totalTurnOver() {
        return totalPrice;
    }
}
