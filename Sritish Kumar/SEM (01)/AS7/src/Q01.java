import java.util.*;

public class Q01 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Size of Array :");
        int n = in.nextInt();
        float r[] = new float[n];
        for (int a = 0; a < n; a++) {
            r[a] = (float) Math.random();
        }
        System.out.println(Arrays.toString(r));
        float s = 0;
        for (int a = 0; a < n; a++) {
            s = s + r[a];
        }
        System.out.println("Sum =" + s);
        System.out.println("Average =" + (s / n));
    }
}