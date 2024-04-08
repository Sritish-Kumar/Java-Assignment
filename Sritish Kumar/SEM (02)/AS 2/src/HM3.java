import java.util.Scanner;

class Bank {
    String bankName;
    long depositAmount;
    static long totalAmount;

    void setBankName(String name) {
        bankName = name;
    }

    void setAmount(long amt) {
        if (amt < 1000) {
            System.out.println("!!! Minimum Deposit in " + bankName + " is 1000 !!!");
            System.out.println("!!! Desposit Amount set to 1000 ");
            amt = 1000;
        }
        depositAmount = amt;
        totalAmount += depositAmount;
    }

    void showData() {
        System.out.println();
        System.out.println("Bank Name: " + bankName);
        System.out.println("Deposit Name: " + depositAmount);
    }

    Bank getMin(Bank[] arr) {
        Bank btemp = new Bank();
        btemp.setAmount(Long.MAX_VALUE);
        for (Bank bank : arr) {
            if (bank.depositAmount < btemp.depositAmount) {
                btemp.depositAmount = bank.depositAmount;
                btemp.setBankName(bank.bankName);
            }

        }
        return btemp;
    }

}

public class HM3 {
    public static void main(String[] args) {
        Bank[] b = new Bank[3];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < b.length; i++) {

            b[i] = new Bank();
            System.out.print("Name: ");
            b[i].setBankName(scan.nextLine());
            System.out.print("Amount: ");
            b[i].setAmount(scan.nextLong());
            scan.nextLine();
            // b[i].showData();

        }

        for (Bank bank : b) {
            bank.showData();
        }

        System.out.println("Total Deposit in all Banks: " + Bank.totalAmount);
        System.out.println("Minimum deposit is ");
        b[0].getMin(b).showData();
        scan.close();

    }

}

// OUTPUTS:
// Name: pnb
// Amount: 2000
// Name: sbi
// Amount: 3000
// Name: kotak
// Amount: 100
// !!! Minimum Deposit in kotak is 1000 !!!
// !!! Desposit Amount set to 1000

// Bank Name: pnb
// Deposit Name: 2000

// Bank Name: sbi
// Deposit Name: 3000

// Bank Name: kotak
// Deposit Name: 1000
// Total Deposit in all Banks: 6000
// Minimum deposit is

// Bank Name: kotak
// Deposit Name: 1000