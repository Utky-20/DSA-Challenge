import java.util.Scanner;

public class prob7 {
    public static void main(String[] args) {
        // converting minutes to hours
        int time, HOURS, minutes;
        System.out.println("type the time in minutes   ");
        Scanner number = new Scanner(System.in);
        time = number.nextInt();
        HOURS = time / 60;
        minutes = time % 60;
        System.out.printf("the time is %d hours and %d minutes ", HOURS, minutes);
    }
}
