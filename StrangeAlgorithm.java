package LetsCodeTogether2;

import java.util.Scanner;

public class StrangeAlgorithm {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter string1");
        String input1=kb.next();
        System.out.println("Enter string2");
        String input2=kb.next();
        int ans=0;
        if(input1.length()!=input2.length())
            System.out.println("-1");
        else
        {
            for (int i=0;i<input1.length();i++)
            {
                char ch1=input1.charAt(i);
                char ch2=input2.charAt(i);
                if(ch1!=ch2)
                    ans++;
            }
        }
        if(ans==input1.length())
            System.out.println("-1");
        else
            System.out.println(ans);
    }
}
