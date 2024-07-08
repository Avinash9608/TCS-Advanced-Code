package LetsCodeTogether2;

import java.util.Scanner;

public class KokoProblem {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int size=0;
        System.out.println("Enter size of Array ");
        size=kb.nextInt();
        int[] arr=new int[size];
        for (int i=0;i<size;i++)
        {
            System.out.println("Enter element (single digit element ");
            arr[i]= kb.nextInt();
        }
        int count=0;
        for (int i=1;i<size;i++)
        {
            if(arr[0]!=arr[i])
            {
                count++;
            }
        }
        System.out.println(count);
        if (arr[0]==arr[size-1])
            System.out.println("Output= "+"0");
        else
            System.out.println("Output= "+(count));
    }
}

/*
 for (int i=1;i<size;i++)
        {
            if(arr[0]==arr[i])
            {
                count++;
            }
        }
        System.out.println(count);
        if (arr[0]==arr[size-1])
            System.out.println("Output= "+"0");
        else
            System.out.println("Output= "+(size-count-1));
    }
 */