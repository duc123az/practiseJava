package Homework.Buoi6;

public class AppTest {
    public static void main(String[] args) {
        StoreManagement mainManagement = new StoreManagement(2);
        System.out.println(mainManagement.getStores());
        
        
        System.out.println(mainManagement.totalPhoneHighTech());

        // Store NVL = new Store("Nguyễn Văn lượng", "1144/34 Nguyễn Văn Lượng", 3);
        // System.out.println(NVL.getPhones());
        // System.out.println("Tổng số điện thoại bán được: " + NVL.totalPhoneSold());
        // System.out.println("Doanh số của tiệm: " + NVL.totalTurnOver());


    }
    
}
