
package Option_2;

import java.util.Scanner;

public class Subroutine {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        NumbersPrint_Ascending(a,b);
    }

    public static void NumbersPrint_Ascending(int a, int b){
        int c = Math.min(a,b);
        int d = Math.max(a,b);
        for (int i = c; i <= d; i++) {
            System.out.println(i);
        }
    }
}

