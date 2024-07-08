package LetsCodeTogether2;

import java.util.Arrays;
import java.util.Scanner;

public class St_Patrick_School_Problem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of board ");
        int n = scanner.nextInt();
        int[] Board = new int[n];
        int[] student = new int[n];
        System.out.println("Enter random number within range ");
        for (int i = 0; i < n; i++) {
            Board[i] = scanner.nextInt();
            student[i] = i + 1;
        }

        int ans = 0;
        while (true) {
            ans++;
            int[] temp = new int[n];
            for (int i = 0; i < n; i++) {
                temp[i] = student[Board[i] - 1];
            }
            for (int i=0;i<n;i++)
            {
                System.out.print(temp[i]+" ");
                System.out.println("ans= "+ans);
            }
            if (Arrays.equals(temp, Arrays.stream(temp).sorted().toArray())) {
                break;
            }
            student = temp;
        }
        System.out.println(ans);
    }
}
