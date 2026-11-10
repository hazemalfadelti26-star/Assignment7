import java.util.Scanner;

public class RockPaperScissorsL4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next().toLowerCase();
        String b = sc.next().toLowerCase();

        if ((!a.equals("rock") && !a.equals("paper") && !a.equals("scissors")) ||
                (!b.equals("rock") && !b.equals("paper") && !b.equals("scissors"))) {
            System.out.println("Invalid Input");
        } else if (a.equals(b)) {
            System.out.println("Draw");
        } else if ((a.equals("rock") && b.equals("scissors")) ||
                (a.equals("paper") && b.equals("rock")) ||
                (a.equals("scissors") && b.equals("paper"))) {
            System.out.println("Player 1 Wins");
        } else {
            System.out.println("Player 2 Wins");
        }
    }
}