package Option_2;

import java.util.Scanner;

class IsPowerOfTwo {
    public static boolean isPower(long n) {
        return (n != 0) && ((n & (n - 1)) == 0);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(isPower(n));
    }
}

