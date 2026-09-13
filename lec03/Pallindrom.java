package lec03;

import java.util.Scanner;

public class Pallindrom {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rev=0;
        int t;
        t=n;
        while(n!=0){
            int digit=n%10;
            rev=(rev*10)+digit;
            n=n/10;
        }

    if(rev==t){
        System.out.println("it is pllindrome");

    }
   else{
        System.out.println("not pllindrome");

    }
    }
}
