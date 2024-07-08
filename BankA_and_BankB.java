package LetsCodeTogether2;

import java.util.Scanner;

public class BankA_and_BankB {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter Principle ");
        int P=kb.nextInt();
        System.out.println("Enter Time (in year)");
        int T=kb.nextInt();
        System.out.println("Enter (number of slabs of interest rates for a given period by Bank A)");
        int N1=kb.nextInt();
        float[][] Bank1=new float[N1][2];
        for (int i=0;i<N1;i++)
        {
            System.out.println("Enter interest rate and time period ");
            for (int j=0;j<2;j++)
            {
                    Bank1[i][j]=kb.nextFloat();
            }
        }

        System.out.println("Enter (number of slabs of interest rates for a given period by Bank B)");
        int N2=kb.nextInt();
        float[][] Bank2=new float[N1][2];
        for (int i=0;i<N2;i++)
        {
            System.out.println("Enter interest rate & time period");
            for (int j=0;j<2;j++)
            {
                Bank2[i][j]=kb.nextFloat();
            }
        }

        int Bank1EmiSum=0;
        int Bank2EmiSum=0;
        for (int i=0;i<Bank1.length;i++)
        {

                float IR=Bank1[i][0];
                float TP=Bank1[i][1];
                Bank1EmiSum+=(P*T)/(1-1/((1+IR)*(TP*12)));
        }
        for (int i=0;i<Bank2.length;i++)
        {

            float IR=Bank2[i][0];
            float TP=Bank2[i][1];
            Bank2EmiSum+=(P*T)/(1-1/((1+IR)*(TP*12)));
        }
        System.out.println(Bank1EmiSum);
        System.out.println(Bank2EmiSum);
        if(Bank1EmiSum>Bank2EmiSum)
            System.out.println("Bank1");
        else
            System.out.println("Bank2");
    }
}
