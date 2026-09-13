package Lec04_class_obj.ShoppingSystem;

public class MAin {
    public static void main(String[] args) {
        Electronics pro=new Electronics(123,"Phone",230000.0,2);
        Clothing pro1=new Clothing(125,"Allen solly",2300.0,8);
        Food pro2=new Food(124,"chicken kuntakey",500.0,4);



        pro.calculateDiscount(15);
        pro.Payment();
        pro.proddetails();

        System.out.println();

        pro1.calculateDiscount(16);
        pro1.Payment();
        pro1.proddetails();

        System.out.println();

        pro2.calculateDiscount(45);
        pro2.Payment();
        pro2.proddetails();
    }
}
