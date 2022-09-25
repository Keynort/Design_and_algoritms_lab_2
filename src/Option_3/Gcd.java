package Option_3;

import java.util.Scanner;

public class Gcd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n =in.nextInt();
        int k =in.nextInt();
        System.out.println(GCD(n,k));
    }
    public static int GCD(int a, int b){
        int r = a % b;
        if(r == 0)
            return b;
        return GCD(b, r);
    }
}