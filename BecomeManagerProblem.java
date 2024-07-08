package LetsCodeTogether2;

import java.util.Scanner;

public class BecomeManagerProblem {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter Total Number of rooms ");
        int N=kb.nextInt();
        System.out.println("Enter Total Number of Gold Coins");
        int K= kb.nextInt();
        int[] arr=new int[N];
        for (int i=0;i<N;i++)
        {
            System.out.println("Enter coins in room");
            arr[i]= kb.nextInt();
        }
        int sum=0;
        int count=0;
        int i=0;
        for ( i=0;i<N;i++)
        {

               sum+=arr[i];
               if(sum<=K)
               {
                   ++count;
               }else
               {
                   sum=0;
                   count=0;
               }
            if(sum==K)
            {
                break;
            }


        }
        System.out.println("count "+count);
        System.out.println("Start Index of sum = "+((i-count+1)+1));
        System.out.println("Last Index of sum = "+(i+1));
    }
}
