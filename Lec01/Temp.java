package Lec01;

import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter tempreture in celcius :");
        double tem=in.nextDouble();
        double far=(tem*9/5)+32;
        System.out.println("The Converted temprature into fahrenhite is :" +far);

            }
}
