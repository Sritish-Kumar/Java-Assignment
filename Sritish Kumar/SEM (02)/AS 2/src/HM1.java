import java.util.Scanner;

class Commission {

    double sales;

    Commission(double sales) {
        this.sales = sales;
    }

    double getCommission() {
        if (sales <= 100)
            return 0.02 * sales;
        else if (sales >= 100 && sales < 5000)
            return 0.05 * sales;
        else
            return 0.08 * sales;
    }

}

public class HM1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your sales amount: ");

        double Sales = scan.nextDouble();

        Commission ob = new Commission(Sales);

        double comAmount = ob.getCommission();

        if (comAmount < 0)
            System.out.println("Invalid input");
        else
            System.out.println("Commission amount: Rs " + comAmount);

    }

}

// OUTPUT

// Enter your sales amount: 500
// Commission amount: Rs 25.0
