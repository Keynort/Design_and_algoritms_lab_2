package midterm;

import java.util.Scanner;

class Task4 {
    static int MatrixMultiplication(int p[], int i, int j) {
        if (i == j)
            return 0;
        int min = Integer.MAX_VALUE;
        for (int k = i; k < j; k++) {
            int count = MatrixMultiplication(p, i, k)
                    + MatrixMultiplication(p, k + 1, j)
                    + p[i - 1] * p[k] * p[j];

            if (count < min)
                min = count;
        }
        return min;
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the quantity of matrixes:");

        int n = in.nextInt();
        int list[] = new int[n];
        System.out.println("Enter the dimensions of matrixes");
        for (int i = 0; i <n ; i++) {
            list[i]=in.nextInt();
        }
        System.out.println("Best order of multiplications is " + MatrixMultiplication(list, 1, n - 1));
    }
}
