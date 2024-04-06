import java.util.Scanner;

class Deposit {
    long principal;
    int time;
    double rate;
    double totalAmt;

    Deposit() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Princiapl : ");
        principal = scan.nextLong();
        System.out.print("Time: ");
        time = scan.nextInt();
        System.out.println("Rate: ");
        rate = scan.nextDouble();
        scan.close();
    }

    Deposit(long principal, int time, double rate) {
        this.principal = principal;
        this.time = time;
        this.rate = rate;

    }

    Deposit(long principal, int time) {
        this.principal = principal;
        this.time = time;
        // Default set to 12
        this.rate = 12;

    }

    Deposit(long principal, double rate) {
        this.principal = principal;
        this.rate = rate;
        // Default set to 5
        this.time = 5;
    }

    void display() {

        System.out.println("Principal:  " + principal);
        System.out.println("Rate: " + rate);
        System.out.println("Time: " + time);
        System.out.println("Total Amount: " + totalAmt);
    }

    void calcAmt() {
        totalAmt = principal + (principal * rate * time) / 100;
    }

}

public class Q4 {
    public static void main(String[] args) {

        Deposit d1 = new Deposit(100000, 24, 5);
        d1.calcAmt();
        d1.display();

    }
}
