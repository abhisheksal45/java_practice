package Lec04_class_obj.shoopingproj;

public abstract class Product {
    private String Prod_id;
    private String Prod_name;
    private double price;

    Product(String prod_id, String Prod_name, double price) {
        this.Prod_id = prod_id;
        this.Prod_name = Prod_name;
        this.price = price;

    }

    public abstract void Product_details();

    public String getProd_id() {
        return this.Prod_id;
    }

    public void setProd_id(String prod_id) {
        this.Prod_id = prod_id;
    }

    public String getProd_name() {
        return this.Prod_name;
    }

    public void setProd_name(String Prod_name){
        this.Prod_name=Prod_name;
    }

    public double getPrice(){
        return price;

    }
  public void setPrice(double price){
        this.price=price;
  }

}