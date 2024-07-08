package LetsCodeTogether2;

import java.util.Arrays;
import java.util.Scanner;

public class SecurityRiskBasedSorting {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter value of N");
        int N=kb.nextInt();
        System.out.println("Enter  specific level of risk (0-2)");
        int[] risk=new int[N];
        for (int i=0;i<N;i++)
        {
            risk[i]=kb.nextInt();
        }
        Arrays.sort(risk);
        for (int x:risk)
            System.out.print(x+" ");
    }
}
