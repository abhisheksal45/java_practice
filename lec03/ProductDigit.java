package lec03;

import java.util.Scanner;

public class ProductDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no you want find the sum of their digits:");
        int n = sc.nextInt();

        int sum=1;
        while(n!=0){
            int digit=n%10;
            sum=sum*digit;
            n=n/10;
        }
    System.out.println(sum);
    }
}