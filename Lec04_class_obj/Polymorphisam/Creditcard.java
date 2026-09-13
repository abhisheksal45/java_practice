package Lec04_class_obj.Polymorphisam;

public class Creditcard extends Payment {
    @Override
    public void pay(){
        System.out.println("payment is done via credit card");
    }
}
