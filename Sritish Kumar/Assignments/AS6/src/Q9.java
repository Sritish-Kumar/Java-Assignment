import java.util.Scanner;

public class Q9 {
    public static boolean passwordChecker(String str) {
        boolean isValid = true;

        if (str.length() >= 8) {
            int digitCount = 0;

            for (int i = 0; i < str.length(); i++) {
                char currentChar = str.charAt(i);

                if ((currentChar >= 'A' && currentChar <= 'Z') || (currentChar >= 'a' && currentChar <= 'z') ||
                        (currentChar >= '0' && currentChar <= '9')) {
                    if (currentChar >= '0' && currentChar <= '9') {
                        digitCount++;
                    }
                } else {
                    isValid = false;
                    break;
                }
            }

            if (digitCount < 2) {
                isValid = false;
            }
        } else {
            isValid = false;
        }

        return isValid;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your password: ");
        String password = sc.next();

        if (passwordChecker(password)) {
            System.out.println("Valid password");
        } else {
            System.out.println("Invalid password");
        }
    }
}
