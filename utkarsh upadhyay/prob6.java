import java.util.Scanner;

public class prob6 {
    public static void main(String[] args) {
        int no;
        int reversed = 0;
        System.out.println("type the number to be reversed ");
        Scanner number = new Scanner(System.in);
        no = number.nextInt();
        while (no != 0) {

            // get last digit from num
            int digit = no % 10;
            reversed = reversed * 10 + digit;

            // remove the last digit from num
            no /= 10;

        }
        System.out.println("the reversed number" + reversed);

    }
}
