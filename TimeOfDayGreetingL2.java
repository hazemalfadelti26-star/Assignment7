
import java.util.Scanner;

public class TimeOfDayGreetingL2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hour = input.nextInt();

        if (hour < 0 || hour > 23) {
            System.out.println("Invalid Hour");
        } else if (hour >= 5 && hour <= 11) {
            System.out.println("Good Morning");
        } else if (hour <= 17) {
            System.out.println("Good Afternoon");
        } else if (hour <= 21) {
            System.out.println("Good Evening");
        } else {
            System.out.println("Good Night");
        }
    }
}
