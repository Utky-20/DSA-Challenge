import java.util.Scanner;

public class prob17 {
    public static void main(String[] args) {
        int n;
        System.out.println("type the number ");
        Scanner number = new Scanner(System.in);
        n = number.nextInt();
        String[] answer = fizzBuzz(n);
        for (String s : answer) {
            System.out.println(s);
        }
    }

    public static String[] fizzBuzz(int n) {
        String[] answer = new String[n];
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                answer[i - 1] = "FizzBuzz";
            } else if (i % 3 == 0) {
                answer[i - 1] = "Fizz";
            } else if (i % 5 == 0) {
                answer[i - 1] = "Buzz";
            } else {
                answer[i - 1] = Integer.toString(i);
            }
        }
        return answer;
    }
}
