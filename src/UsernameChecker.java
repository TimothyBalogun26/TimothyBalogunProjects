import java.util.Scanner;

public class UsernameChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your username: ");
        String username = input.nextLine();

        if (isSecureUsername(username)) {
            System.out.println("Your username is secure.");
        } else {
            System.out.println("Your username is not secure.");
        }
    }

    public static boolean isSecureUsername(String username) {
        if (username.length() < 8 || username.length() > 20) {
            return false;
        }

        if (!username.matches(".*[a-zA-Z].*")) {
            return false;
        }

        if (!username.matches(".*[0-9].*")) {
            return false;
        }

        if (!username.matches("^[a-zA-Z0-9]*$")) {
            return false;
        }

        return true;
    }
}
