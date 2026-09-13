package Lec04_class_obj.Polymorphisam;

public class UPIPayment extends Payment{
   @Override
    public void pay(){
       System.out.println("Payment is done via UPI");

    }
}
