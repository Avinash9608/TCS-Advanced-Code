package LetsCodeTogether2;

import java.util.Scanner;
import java.util.stream.IntStream;

public class DifferenceBWSumOFAllAndSmllest {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter size of array ");
        int size=kb.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter element in array ");
        for (int i=0;i<size;i++)
        {
            arr[i]=kb.nextInt();
        }
        System.out.println("Your enterend elements are ");
        for (int x:arr)
            System.out.print(x+" ");
        int min=Integer.MAX_VALUE;
        int sum= IntStream.of(arr).sum();
        for (int i=0;i<size;i++)
        {
            if(arr[i]<min)
                min=arr[i];
        }
        System.out.println();
        System.out.println("sum-"+sum);
        System.out.println("min-"+min);
        System.out.println("Difference between the sum of all the elements of given array and the smallest element in the array is ="+(sum-min));
    }
}
