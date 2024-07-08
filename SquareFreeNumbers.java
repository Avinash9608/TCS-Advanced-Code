package LetsCodeTogether2;
import java.util.Scanner;

public class SquareFreeNumbers {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int[] prime={2,3,5,7,11,13,17,19};
        System.out.println("Enter the number ");
        int n=kb.nextInt();
        int count=0;
        for (int i=0;i< prime.length;i++)
        {
            if(n%prime[i]==0)
                count++;
        }
        System.out.println((1<<count)-1);
    }
}
