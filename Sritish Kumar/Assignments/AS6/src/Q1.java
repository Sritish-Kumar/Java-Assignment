import java.util.*;

class Q1 {
    public static int additionSimple(int x, int y) {
        return x + y;
    }

    public static int subtractionSimple(int x, int y) {
        return x - y;
    }

    public static int multiplicationSimple(int x, int y) {
        return x * y;
    }

    public static double divisionSimple(int x, int y) {
        if (x != 0)
            return (double) y / x;
        else
            return 0;
    }

    public static int remainderSimple(int n, int m) {
        return n % m;
    }

    public static double squareRootSimple(int n) {
        if (n >= 0)
            return Math.sqrt(n);
        else
            return 0.0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("Enter operation (+, -, *, /, %, r for root): ");
        char c = sc.next().charAt(0);

        switch (c) {
            case '+':
                System.out.println("Addition value of " + a + " and " + b + " is " + additionSimple(a, b));
                break;
            case '-':
                System.out.println("Subtraction value of " + a + " and " + b + " is " + subtractionSimple(a, b));
                break;
            case '*':
                System.out.println("Multiplication value of " + a + " and " + b + " is " + multiplicationSimple(a, b));
                break;
            case '/':
                System.out.println("Division value of " + b + " by " + a + " is " + divisionSimple(a, b));
                break;
            case '%':
                System.out.println("Remainder value of " + a + " by " + b + " is " + remainderSimple(a, b));
                break;
            case 'r':
                System.out.println("Square root of " + a + " is " + squareRootSimple(a));
                break;
            default:
                System.out.println("Wrong input");
        }
    }
}
