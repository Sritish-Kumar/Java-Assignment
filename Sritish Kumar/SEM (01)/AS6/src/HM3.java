import java.util.*;

public class HM3 {
    public static char middleCharacter(String str) {
        return str.charAt(str.length() / 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String: ");
        String str = sc.next();

        System.out.println("Middle character of " + str + " is " + middleCharacter(str));
    }
}
