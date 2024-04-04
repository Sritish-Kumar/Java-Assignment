
import java.util.*;

public class HM2 {
    public static double volume(int s) {
        return Math.pow(s, 3);
    }

    public static double volume(double r) {
        return (4.0 / 3) * Math.PI * Math.pow(r, 3);
    }

    public static int volume(int l, int b, int h) {
        return l * b * h;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Press 1 for cube, 2 for sphere, and 3 for cuboid");
        System.out.println("Enter your choice: ");
        int c = sc.nextInt();

        switch (c) {
            case 1:
                System.out.println("Enter the side of cube: ");
                int s = sc.nextInt();
                System.out.println("Volume of cube is: " + volume(s) + " cubic units");
                break;

            case 2:
                System.out.println("Enter the radius of sphere: ");
                double r = sc.nextDouble();
                System.out.println("Volume of sphere is: " + volume(r) + " cubic units");
                break;

            case 3:
                System.out.println("Enter the value of three sides of cuboid: ");
                int x = sc.nextInt();
                int y = sc.nextInt();
                int z = sc.nextInt();
                System.out.println("Volume of cuboid is: " + volume(x, y, z) + " cubic units");
                break;

            default:
                System.out.println("Wrong Input");
        }
    }
}
