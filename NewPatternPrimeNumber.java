package LetsCodeTogether2;
import java.util.ArrayList;
import java.util.Scanner;
public class NewPatternPrimeNumber {
    private static boolean isPrime(int x)
    {
        if(x<=1)
            return false;
        for (int i=2;i<=Math.sqrt(x);i++)
        {
            if(x%i==0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter value of N");
        int N=kb.nextInt();
        ArrayList<Integer> primeStore=new ArrayList<>();
        ArrayList<Integer> sumStore=new ArrayList<>();
        for(int i=1;i<=N;i++)
        {
            if(isPrime(i))
            {
                primeStore.add(i);
            }
        }
        int count=0;
        int sum=0;
        for (int i=0;i<primeStore.size();i++)
        {
            sum+=primeStore.get(i);
            sumStore.add(sum);
            if(sumStore.contains(primeStore.get(i)))
                count++;
        }
        System.out.println(primeStore);
        System.out.println(sumStore);
        System.out.println(count-1);
    }
}
