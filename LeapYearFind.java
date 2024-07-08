package LetsCodeTogether2;

import java.util.Scanner;

public class LeapYearFind {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter year ");
        int year=kb.nextInt();
        if((year%4==0 && year%100!=0)|| (year%400==0))
            System.out.println(year+" leap year ");
        else
            System.out.println(year+" not leap year");

    }
}
