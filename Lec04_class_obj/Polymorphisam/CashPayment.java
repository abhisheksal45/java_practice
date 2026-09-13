package Lec04_class_obj.Polymorphisam;

public class CashPayment extends Payment{
    @Override
    public void pay(){
        System.out.println("Payment is done via Cash");
    }
}
