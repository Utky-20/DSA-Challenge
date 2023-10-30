import java.util.Scanner;

public class prob10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < n; i++) {
            int no = s.charAt(i) - '0';
            int rev = 9 - no;
            if (rev < no) {
                sb.setCharAt(i, (char) ('0' + rev));
            }
        }
        System.out.println(sb.toString());
    }
}
