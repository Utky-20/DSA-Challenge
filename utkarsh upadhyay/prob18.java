public class prob18 {
    public static void main(String[] args) {
        int n, max;

        int A[] = { 1, 2, 3, 5, 7, 2 };
        max = Integer.MIN_VALUE;
        for (n = 0; n < 6; n++) {
            if (A[n] > max) {
                max = A[n];
            }
        }
        System.out.printf("the greatest number is %d", max);
    }
}