import java.util.Scanner;

public class HM05_Concatenation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rows = scan.nextInt();
        String s = "1";
        System.out.println(s);
        for (int i = 2; i <= rows; i++) {
            s = s + i + s;
            System.out.println(s);
        }
        scan.close();
    }
}
