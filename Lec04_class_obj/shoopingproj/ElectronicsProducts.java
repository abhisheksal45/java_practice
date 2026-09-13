package Lec04_class_obj.shoopingproj;

public class ElectronicsProducts extends Product implements Discount,Payment{
    private String brand;
    double final_price;
    ElectronicsProducts(String Prod_id,String Prod_name,double price,String brand){
        super(Prod_id,Prod_name,price);
        this.brand=brand;
    }

    @Override
    public void Product_details(){
System.out.println("The name of the Product is "+getProd_name());
System.out.println("the id of Product is "+getProd_id());
System.out.println("Brand "+brand);
System.out.println("Price "+getPrice());

    }

    @Override
    public double Applydiscount(double percentage) {
        double dis=getPrice()*(percentage/100.0);
         final_price=getPrice()-dis;
        System.out.println("the final price is "+final_price);
        return final_price;
    }
    @Override
    public void  processPayment(double amount){
        System.out.println("the amount for Product "+getProd_name() + " is "+final_price +"is in progress");
    System.out.println("payment is done");
    }
}
