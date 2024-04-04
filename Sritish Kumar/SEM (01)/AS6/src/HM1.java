import java.util.*;

class HM1 {
    public static char nonRepeatedChar(String str) {
        int pos = 0;
        for (int i = 0; i < str.length(); i++) {
            pos = i;
            System.out.println(pos + " " + i);

            pos = str.indexOf(str.charAt(i), pos + 1);
            if (pos == -1)
                return str.charAt(i);

        }
        return ' ';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your password: ");
        String str = sc.next();
        System.out.println(nonRepeatedChar(str));
    }
}

// class HQ1 {
// public static char nonRepeatedChar(String str) {
// for (int i = 0; i < str.length(); i++) {
// char currentChar = str.charAt(i);
// if (str.indexOf(currentChar) == str.lastIndexOf(currentChar)) {
// return currentChar;
// }
// }
// return ' ';
// }

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter your password: ");
// String str = sc.next();
// System.out.println("The first non-repeated character is: " +
// nonRepeatedChar(str));
// }
// }
