import java.util.Scanner;

public class MinorProjectQ2 {
    static StringBuilder convertedString = new StringBuilder();

    public static String hexAlpha(int n) {
        switch (n) {
            case 10:
                return "A";
            case 11:
                return "B";
            case 12:
                return "C";
            case 13:
                return "D";
            case 14:
                return "E";
            case 15:
                return "F";

            default:
                return "#";
        }
    }

    public static void convertToAnyBase(int n, int b) {
        int n1 = n;
        switch (b) {

            case 2:
                // binary conversion
                while (n > 0) {
                    convertedString.append(Integer.toString(n % 2));
                    n = n / 2;

                }
                break;

            case 8:
                // octal conversion
                while (n > 0) {
                    convertedString.append(Integer.toString(n % 8));
                    n = n / 8;

                }

                break;

            case 16:
                // hexa decimal coversion
                while (n > 0) {
                    int rem = n % 16;
                    if (rem >= 10) {
                        String str = hexAlpha(rem);
                        convertedString.append(str);
                        n = n / 16;
                    } else {
                        convertedString.append(Integer.toString(rem));
                        n = n / 16;
                    }

                }

            default:
                break;
        }
        System.out.println("After conversion: " + convertedString.reverse());
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Decimal Num: ");
        int n = scan.nextInt();

        System.out.println("\nEnter the base you want to covert to - ");
        System.out.printf("%15s%02d\n", "Binary Number- ", 2);
        System.out.printf("%15s%02d\n", "Octal Number - ", 8);
        System.out.printf("%15s%02d\n", "Hexa Decimal - ", 16);
        System.out.print(":> ");
        String base = scan.next();
        scan.close();
        int b;

        if (base.equalsIgnoreCase("b") || base.equalsIgnoreCase("binary") || base.equals("2")) {
            b = 2;
            // System.out.println(Integer.toBinaryString(n));
            convertToAnyBase(n, b);

        } else if (base.equalsIgnoreCase("o") || base.equalsIgnoreCase("octal") || base.equals("8")) {
            b = 8;
            // System.out.println(Integer.toOctalString(n));
            convertToAnyBase(n, b);

        } else if (base.equalsIgnoreCase("x") || base.equalsIgnoreCase("hexa") || base.equals("16")) {
            b = 16;
            // System.out.println(Integer.toHexString(n));
            convertToAnyBase(n, b);
        } else {
            System.out.println(" - Entered base is invalid please try again - ");
        }

    }

}
