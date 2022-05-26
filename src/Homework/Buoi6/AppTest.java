package Homework.Buoi6;

import java.util.Scanner;

public class AppTest {
    public static void main(String[] args) {
        // Scanner scr = new Scanner(System.in);
        // System.out.print("Nhập tổng số cửa hàng: ");
        // int n = scr.nextInt();

        StoreManagement mainManagement = new StoreManagement(2);

        System.out.println(mainManagement.addStores());
        
        mainManagement.getStores()[1].getNameStore();


        // for (int i = 0; i < mainManagement.getStores().length; i++) {
        //     mainManagement.getStores()[i].toString();
        // }





        // for (Store i : mainManagement.getStores()) {
        //     i.toString();
        // }

        // StoreManagement mainManagement = new StoreManagement(2);
        // System.out.println(mainManagement.getStores());
        // System.out.println(mainManagement.totalPhoneHighTech());

        // Store NVL = new Store("Nguyễn Văn lượng", "1144/34 Nguyễn Văn Lượng", 3);
        // System.out.println(NVL.addPhone());
        // System.out.println("Tổng số điện thoại bán được: " + NVL.totalPhoneSold());
        // System.out.println("Doanh số của tiệm: " + NVL.totalTurnOver());
    }
    
}
