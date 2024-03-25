import java.util.Scanner;

public class HM05_Concatenation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rows = scan.nextInt();
        String s = "";
        for (int i = 1; i <= rows; i++) {
            s = s + i + s;
            System.out.println(s);
        }
        scan.close();
    }
}
