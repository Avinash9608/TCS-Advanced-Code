package LetsCodeTogether2;

import java.util.ArrayList;
import java.util.Scanner;

public class ChemicalLaboratory {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter value N");
        int N=kb.nextInt();
        int[] rockSample=new int[N];
        System.out.println("Enter rock sample ");
        for (int i=0;i<N;i++)
        {
            rockSample[i]= kb.nextInt();
        }
        System.out.println("Enter range of sample ");
        int R=kb.nextInt();
        ArrayList<ArrayList<Integer>> storeRange=new ArrayList<>(R);

        for (int i=0;i<R;i++)
        {
            storeRange.add(new ArrayList<>());
        }
        System.out.println("Enter range ");
        for (int i=0;i<R;i++)
        {
            for (int j=0;j<2;j++)
            {
                storeRange.get(i).add(kb.nextInt());
            }
        }
        ArrayList<Integer> result=new ArrayList<>(R);
        for (int i = 0; i < R; i++) {
            result.add(0);
        }

        for (int i = 0; i<rockSample.length; i++)
        {
            int x=rockSample[i];
            for (int j=0;j<R;j++)
            {
                if(x>=storeRange.get(j).get(0) && x<=storeRange.get(j).get(1))
                    result.set(j,result.get(j)+1);

            }
        }
        System.out.println(result);
    }
}
