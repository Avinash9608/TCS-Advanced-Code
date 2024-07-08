package LetsCodeTogether2;

import java.util.Scanner;

public class HorseBetProblem {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter the Number of horses ");
        int N=kb.nextInt();
        System.out.println("Enter Reward Money ");
        int K=kb.nextInt();
        int[] arr=new int[N];
        for (int i=0;i<N;i++)
        {
            System.out.println("Enter Price of betting on N horses in Order ");
            arr[i]= kb.nextInt();
        }
        int max=Integer.MIN_VALUE;
        int count=0;
        int sum=0;
       for (int i=0;i<N;i++)
       {
           sum+=arr[i];
           if(sum<K)
           {
               count++;
           }
           else {
               sum=0;
               count=0;
           }
           if(count>max)
           {
               max=count;
           }
       }
        System.out.println("Max subsequence is "+max);
    }
}
