package LetsCodeTogether2;

import java.util.Scanner;

public class Swap2NoWithoutThird {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter 2 integer ");
        int a=kb.nextInt();
        int b= kb.nextInt();
        System.out.println("Your inputted nos are "+a+", "+b);
        //Logic for swap
        a=a+b;  //a=3+4, a=7
        b=a-b;  //b=7-4, b=3
        a=a-b;  //a=7-4 ,a=4
        System.out.println("After swapping nos are "+a+", "+b);
    }
}
