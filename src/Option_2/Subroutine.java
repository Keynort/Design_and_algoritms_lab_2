package Option_2;

import java.util.Scanner;

public class Subroutine {
    public static int sumOfNumber(int a,int b) {
        if (a <= b) {
        return sumOfNumber(a,0);
        }
        return sumOfNumber(a + 1, b);

    }
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(sumOfNumber(a,b));
    }
}

