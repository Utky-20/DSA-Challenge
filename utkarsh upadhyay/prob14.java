public class prob14 {
    public static void main(String[] args) {
        int N = 5;
        int result = factorial(N);
        System.out.println("Factorial of " + N + " is " + result);
    }

    public static int factorial(int N) {
        if (N == 0) {
            return 1;
        } else {
            return N * factorial(N - 1);
        }
    }
}