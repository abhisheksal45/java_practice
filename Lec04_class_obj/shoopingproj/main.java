package Lec04_class_obj.shoopingproj;

public class main {
    public static void main(String[] args) {
        ElectronicsProducts en=new ElectronicsProducts("AB123","Iphone18",180000,"Apple");
        en.Product_details();
        en.Applydiscount(7.0);
       en.processPayment(en.final_price);
    }
}
