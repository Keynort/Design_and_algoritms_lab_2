package Option_1;

import java.util.Scanner;

    public class Numbers_Between_A_and_B {
        public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        if(a<=b) {
            for (int i = a+1; i <= b; i++) {
                System.out.println(i);
            }
        }
    }
}

