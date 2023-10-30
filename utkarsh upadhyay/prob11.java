public class prob11 {
    public static void main(String[] args) {
        int i, j, l, z = 4;
        for (i = 0; i <= z; i++) {
            for (l = i; l <= z; l++) {
                System.out.print(" ");
            }

            for (j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
