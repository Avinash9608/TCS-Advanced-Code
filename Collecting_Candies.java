package LetsCodeTogether2;

import java.util.Scanner;

public class Collecting_Candies {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Number of test-cases ");
        int testCase=kb.nextInt();
//        if (testCase > 1 && testCase < 10) {
//            System.out.println("testCase is between 1 and 10");
//            System.exit(0);
//        }
        System.out.println("Enter number of boxes ");
        int box=kb.nextInt();
//        if(box>1 && box<10000)
//        {
//            System.out.println("boxes is between 1 and 10000");
//            System.exit(0);
//        }
        System.out.println("Enter number of candies in each box");
        int[] arr=new int[box];
        for (int i=0;i<box;i++)
        {
            arr[i]=kb.nextInt();
        }
        int time=0;
        int sum=arr[0];
        for (int i=1;i<box;i++)
        {
            sum=sum+arr[i];
            time+=sum;
        }
        System.out.println("Time is "+time);
    }

}
