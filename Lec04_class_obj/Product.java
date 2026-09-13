package Lec04_class_obj;

public class Product {
   private double price;
   public Product(double price){
       setPrice(price);
   }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
       if(price<=0){
           System.out.println("Please enter value greater than 0");
       }
    else {
        this.price=price;
       }
   }
}
