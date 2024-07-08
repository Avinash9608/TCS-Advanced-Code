package LetsCodeTogether2;

import java.util.Scanner;

public class HouseThiefProblem {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter size of array ");
        int size=kb.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter elements in array ");
        for (int i=0;i<size;i++)
        {
            arr[i]= kb.nextInt();
        }
        int sumEv=0;
        int sum0dd=0;
        for (int i=0;i<size;i++)
        {
            if(i%2==0)
            {
                sumEv+=arr[i];
            }else
            {
                sum0dd+=arr[i];
            }
        }
        System.out.println("Max coins contains "+Math.max(sumEv,sum0dd));
    }
}
