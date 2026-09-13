package Lec04_class_obj;

import java.util.Scanner;

public class Car {
    public static void main(String[] args) {
String brand;
String model;
Double price;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter brand");
  brand=sc.nextLine();
  System.out.println("Enter model");
  model=sc.nextLine();
  System.out.println("Enter price");
  price=sc.nextDouble();
  car1 ca=new car1();
  ca.dcetails(brand,model);
        ca.carprice(price);
    }
public static class car1{
        public String dcetails(String brand,String model) {
            System.out.println("the brand of car is " + brand + " and the model is " + model);
            return brand + model;
        }
public Double carprice(double price){
    System.out.println("the price of the car is "+price);
            return price;

        }
}
}
