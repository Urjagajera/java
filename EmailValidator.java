import java.util.Scanner;
import java.util.regex.Pattern;

public class EmailValidator {

    static boolean isValidEmail(String email) {
        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        return Pattern.matches(regex, email);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter email address: ");
        String email = sc.nextLine();

        if (isValidEmail(email))
            System.out.println("Valid email address.");
        else
            System.out.println("Invalid email address.");

        sc.close();
    }
}
