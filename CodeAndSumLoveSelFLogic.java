package LetsCodeTogether2;

import java.util.Scanner;

public class CodeAndSumLoveSelFLogic {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println(("Enter your size "));
        int size= kb.nextInt();
        int sum=0;
        for (int i=0;i<size;i++)
        {
            int x= kb.nextInt();
            x=(int)Math.pow(2,x);
            if(x>99)
            {
                sum+=x%100;
            }else
            {
                sum+=x;
            }
        }
        System.out.println("sum= "+(sum%100));
    }
}
