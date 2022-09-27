package Option_5;

import java.util.Scanner;

public class SumAlgorithm {
    public static int sumOfNumber(int n) {
        if (n <= 1)
            return n;
        return n + sumOfNumber(n - 1);
    }
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(sumOfNumber(n));
    }
}

