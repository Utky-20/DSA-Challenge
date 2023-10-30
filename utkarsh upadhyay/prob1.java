import java.util.Scanner;

public class prob1 {
    public static void main(String[] args) {

        double celsius, fahrenheit;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter temperature in Celsius: ");
        celsius = input.nextDouble();
        fahrenheit = (celsius * 1.8) + 32;
        System.out.printf("%.2f Celsius = %.2f Fahrenheit", celsius, fahrenheit);
    }
}
