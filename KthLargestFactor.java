package LetsCodeTogether2;

import java.util.ArrayList;
import java.util.Scanner;

public class KthLargestFactor {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter value of N");
        int N=kb.nextInt();
        System.out.println("Enter value of k");
        int K=kb.nextInt();
        ArrayList<Integer> factStore=new ArrayList<>();
        for(int i=1;i<=N;i++)
        {
            if(N%i==0)
                factStore.add(i);
        }
        if(K>factStore.size())
            System.out.println("1");
        else
            System.out.println(factStore.get(K));
    }
}
