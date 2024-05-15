public class HM5 {

    public static String reverse(String s) {
        if (s == null || s.length() == 1) {
            return s;
        }
        return reverse(s.substring(1)) + s.charAt(0);

    }

    public static void main(String[] args) {
        String name = "abc";

        System.out.println(reverse(name));
    }
}

// Write a recursive Java method that takes a character string s and outputs its
// reverse. For
// example, the reverse of 'pots&pans' would be 'snap&stop'.
