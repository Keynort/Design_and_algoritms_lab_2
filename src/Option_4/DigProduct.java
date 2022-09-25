package Option_4;

import java.util.Scanner;

public class DigProduct {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int digit;
    int mult =1;
    while (n>0){
        digit = n%10;
        n=n/10;
        mult=mult*digit;
    }
        System.out.println(mult);
    }
}