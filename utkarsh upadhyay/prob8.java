import java.util.Scanner;

public class prob8 {
    public static void main(String[] args) {
        int n;
        System.out.println("type the floors   ");
        Scanner number = new Scanner(System.in);
        n = number.nextInt();
        if (n >= 13) {
            System.out.println("yes");

        } else {
            System.out.println("no");

        }

    }
}
