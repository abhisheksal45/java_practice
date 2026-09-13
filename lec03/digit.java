package lec03;

import java.util.Scanner;

public class digit {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter no:");
        int count=0;
        int n=in.nextInt();
        while(n!=0){
            n=n/10;
            count++;
        }
    System.out.println(count);
    }
}
