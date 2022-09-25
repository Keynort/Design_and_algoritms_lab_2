package Option_4;

import java.util.Scanner;

public class ListSum {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int list[] = new int [n];
        for (int i = 0; i < n; i++) {
            list[i]=in.nextInt();
        }
        int sum =0;
        for (int i = 0; i < n; i++) {
            sum+=list[i];
        }
        System.out.println(sum);
    }
}