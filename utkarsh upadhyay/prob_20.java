public class prob_20 {

    public static void main(String[] args) {

        int i, j, n;

        int A[] = { 12, 18, 34, 876, 02, 23 };
        n = A.length;

        for (i = n - 1; i > 0; i--) {
            for (j = 0; j < i; j++) {

                if (A[j] > A[j + 1]) {
                    swap(A, j, j + 1);

                }
            }
        }

        for (int k = 0; k < n; k++) {
            System.out.print(A[k] + " ");
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
