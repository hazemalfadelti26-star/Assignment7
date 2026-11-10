import java.util.Scanner;

public class CharacterClassifierL3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        if (Character.isLetter(ch)) {
            if ("aeiouAEIOU".indexOf(ch) >= 0) {
                System.out.println("Vowel");
            } else {
                System.out.println("Consonant");
            }
        } else if (Character.isDigit(ch)) {
            System.out.println("Digit");
        } else {
            System.out.println("Special Character");
        }
    }
}
