import java.util.Scanner;

public class Q10_Grading {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your marks ");
        int marks = scan.nextInt() / 10;
        char grade = 'F';
        switch (marks) {
            case 9:
                grade = 'O';
                break;
            case 8:
                grade = 'A';
                break;
            case 7:
                grade = 'B';
                break;
            case 6:
                grade = 'C';
                break;
            case 5:
                grade = 'D';
                break;
            case 4:
                grade = 'E';
                break;
        }
        System.out.println("Your Grade is " + grade);
        scan.close();

    }
}
