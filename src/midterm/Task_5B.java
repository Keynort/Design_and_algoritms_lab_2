package midterm;

public class Task_5B {
    static int max(int a, int b) {
        return Math.max(a, b);
    }
    static int Knapsack(int capacity, int sizes[], int val[], int n) {
        if (n == 0 || capacity == 0)
            return 0;
        if (sizes[n - 1] > capacity)
            return Knapsack(capacity, sizes, val, n - 1);
        else
            return max(val[n - 1]
                            + Knapsack(capacity - sizes[n - 1], sizes,
                    val, n - 1),
                    Knapsack(capacity, sizes, val, n - 1));
    }

    public static void main(String args[]) {
        int val[] = new int[] { 4,6 ,7 ,9,10 };
        int sizes[] = new int[] { 3,5,7,8,9 };
        int capacity = 22;
        int n = val.length;
        System.out.println("Final sum is :"+Knapsack(capacity, sizes, val, n));
    }
}
