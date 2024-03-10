import java.util.Scanner;

class Q7 {
    public static int count(String str) {
        int count = 0;
        String vowels = "aeiouAEIOU";

        for (int i = 0; i < str.length(); i++) {
            char currentChar = Character.toLowerCase(str.charAt(i));
            if (vowels.contains(String.valueOf(currentChar))) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String str = sc.nextLine();

        System.out.println("Number of vowels in " + str + " is " + count(str));
    }
}
