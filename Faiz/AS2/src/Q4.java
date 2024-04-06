package src;

import java.util.Scanner;

class Deposit {
	long principal;
	int time;
	double rate;
	double totalamt;

	Deposit() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the principal amount: ");
		this.principal = sc.nextLong();
		System.out.print("Enter the time: ");
		this.time = sc.nextInt();
		System.out.print("Enter the rate: ");
		this.rate = sc.nextDouble();
	}

	Deposit(long x, int y, double z) {
		this.principal = x;
		this.time = y;
		this.rate = z;
	}

	Deposit(long x, int y) {
		this.principal = x;
		this.time = y;
		this.rate = 10; // default
	}

	Deposit(long x, double z) {
		this.principal = x;
		this.rate = z;
		this.time = 2; // default
	}

	void display() {
		System.out.println("The principal amount is: " + this.principal);
		System.out.println("The rate is: " + this.rate);
		System.out.println("The time period is: " + this.time);
	}

	void calcAmt() {
		totalamt = principal + (principal * rate * time) / 100;
		System.out.println("The total amount is: " + totalamt);
	}
}

public class Q4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deposit new_Customer = new Deposit(3000, 2, 5.5);
		new_Customer.display();
		new_Customer.calcAmt();
	}
}