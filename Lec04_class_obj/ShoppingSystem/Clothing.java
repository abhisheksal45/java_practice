package Lec04_class_obj.ShoppingSystem;

public class Clothing extends Product implements Discount{
    int quan;
    double res;

    public Clothing(int id, String name, Double price,int quan) {
        super(id, name, price);
        this.quan=quan;
    }

    @Override
    public double calculateDiscount(double per) {
        res=this.price*(per/100);
        System.out.println("Discounted price for " +this.name+ " for 1 quantitily is "+res);
    return res;
    }

    @Override
    public void Payment() {
        double payment=quan*res;

        System.out.println("the Payment for " +this.quan+ " quantity of "+ this.name +" is " +payment);
    }
    @Override
    public void proddetails() {
        System.out.println("Name of product "+this.name);
        System.out.println("Price after discount "+res);
        System.out.println("quantity "+this.quan);



    }
}
