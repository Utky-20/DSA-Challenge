public class prob5 {
    public static void main(String[] args) {
        int no, digit1, digit2, digit3;
        no = 139;

        digit3 = no % 10;
        digit2 = no / 10;
        digit1 = digit2 % 10;
        int sum = digit1 + digit2 + digit3;
        if (sum % 2 == 0) {
            System.out.println("the car will run on even day");
        } else {

            System.out.println("the car will run on odd day");
        }
    }
}
