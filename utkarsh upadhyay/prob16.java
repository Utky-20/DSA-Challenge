import java.util.Scanner;

public class prob16 {
    public static void main(String[] args) {
        int n, kount;
        Scanner number = new Scanner(System.in);
        n = number.nextInt();
        kount = 0;
        // k is the number of times 6 occurs in this thing
        while (n != 0) {
            if (n % 10 == 6) {
                kount = kount + 1;
            }
            n = n / 10;

        }
        System.out.println(kount);
        number.close();
    }

}
