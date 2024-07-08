package LetsCodeTogether2;
import java.util.Scanner;

public class SupermarketMaintains {
    private static int productPrice(int x)
    {
        int temp=x;
        int product=1;
        while (temp>0)
        {
            int rem=temp%10;
            product*=rem;
            temp/=10;
        }
        return product;
    }
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter Value of N");
        int N=kb.nextInt();
        int result=productPrice(N);
        System.out.println("Price of product is "+result);
    }
}
