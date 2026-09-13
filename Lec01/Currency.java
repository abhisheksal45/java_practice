package Lec01;

import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Amount in indian rupee");
        double ind=in.nextDouble();

        double US=ind/94.4;
        double EU=ind*0.0091;
        double PO=ind*0.0078;

        System.out.println("US dollar is "+US);
        System.out.println("euros are "+EU);

        System.out.println("Pounds are "+PO);

    }
}
