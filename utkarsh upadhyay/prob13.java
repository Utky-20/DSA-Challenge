import java.util.Scanner;
public class prob13 {
    

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0, b = 1, c;
        if (n == 0)
            System.out.println(a);
        else if (n == 1)
            System.out.println(b);
        else {
            for (int i = 2; i <= n; i++) {
                c = a + b;
                a = b;
                b = c;
            }
            System.out.println(b);
        }
    }
}
}
