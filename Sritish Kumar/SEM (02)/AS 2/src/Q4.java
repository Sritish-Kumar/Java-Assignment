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

    }

    Deposit(long principal, int time, double rate) {
        this.principal = principal;
        // this.time = time;
        // this.rate = rate;

    }

    Deposit(long principal, int time) {
        // this.principal = principal;
        this.time = time;
        // this.rate = 10;

    }

    Deposit(long principal, double rate) {
        // this.principal = principal;
        this.rate = rate;
        // this.time = 5;
    }

    void display() {

        System.out.println("P " + principal);
        System.out.println("R " + rate);
        System.out.println("T " + time);
        System.out.println("Total amt" + totalAmt);
    }

    void calcAmt() {
        totalAmt = principal + (principal * rate * time) / 100;
    }

}

public class Q4 {
    public static void main(String[] args) {

        Deposit d1 = new Deposit(100000, 5, 5);
        d1.calcAmt();
        d1.display();

    }
}

// Define a class Deposit. The instance variable of the class Deposit are
// mentioned
// below.
// 1
// Instance Variable Data Type
// Principal Long
// Time Integer
// Rate Double
// TotalAmt Double
// Initialize the instance variables Principal, Time, rate through constructors.
// Constructors
// are overloaded with the following prototypes.
// Constructor1: Deposit ( )
// Constructor2: Deposit (long, int, double)
// Constructor3: Deposit (long, int)
// Constructor4: Deposit (long, double)
// Apart from constructor, the other instance methods are
// (i) display ( ): to display the value of instance variables,
// (ii) calcAmt( ): to calculate the total amount.
// totalAamt = Principal + (PrincipalÖrateÖTime)/100;
