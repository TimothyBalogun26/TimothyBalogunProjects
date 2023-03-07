import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a password: ");
        String password = input.nextLine();

        if (isSecurePassword(password)) {
            System.out.println("The password is secure.");
        } else {
            System.out.println("The password is not secure.");
        }
    }

    public static boolean isSecurePassword(String password) {
        // Check if password length is at least 8 characters
        if (password.length() < 8) {
            return false;
        }

        // Check if password contains at least one uppercase letter
        if (!password.matches(".*[A-Z].*")) {
            return false;
        }

        // Check if password contains at least one lowercase letter
        if (!password.matches(".*[a-z].*")) {
            return false;
        }

        // Check if password contains at least one digit
        if (!password.matches(".*\\d.*")) {
            return false;
        }

        // Check if password contains at least one special character
        if (!password.matches(".*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?].*")) {
            return false;
        }

        // If all checks pass, return true
        return true;
    }
}









