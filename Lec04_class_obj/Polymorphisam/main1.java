package Lec04_class_obj.Polymorphisam;

public class main1 {
    public static void main(String[] args) {
//        Animal d=new dog();
//        Animal ca=new cat();
//        Animal co=new cow();
//
//        d.sound();
//        ca.sound();
//        co.sound();

//        Addition add =new Addition();
//        add.Add(3,5);
//        add.Add(4,6,8);
//        add.Add(4.6,8.9);
//
//        Payment pa=new Payment();
//        Payment ca=new CashPayment();
//        Payment up=new UPIPayment();
//        Payment cr=new Creditcard();
//
//        pa.pay();
//        cr.pay();
//System.out.println();
//        pa.pay();
//        up.pay();
//System.out.println();
//        pa.pay();
//        ca.pay();

        Shape ci=new Circle(19.6);
        Shape rec=new Rectangle(6,7);
        Shape tri=new Triangle(6,8);

        ci.area();
        System.out.println();
        rec.area();
        System.out.println();
        tri.area();



    }
}
