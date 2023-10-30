import java.util.Scanner;

public class prob2 {
    public static void main(String[] args) {
        int a, i, rem;
        System.out.println("type the number to be reversed ");
        Scanner no = new Scanner(System.in);
        i = 0;
        a = no.nextInt();
        while (a != 0) {
            rem = a % 10;
            i = i * 10 + rem;
            a /= 10;

        }
        System.out.printf("the reversed no is %d", i);

    }
}
