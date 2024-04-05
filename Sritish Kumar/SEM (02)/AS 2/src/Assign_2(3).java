package dsa_iter;
import java.util.Scanner;

class Complex{
	int real;
	int imag;
	void setData() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter real number: ");
		this.real = sc.nextInt();
		System.out.print("Enter imaginary number: ");
		this.imag = sc.nextInt();
	}
	public Complex add(Complex c1,Complex c2) {
		Complex c3 = new Complex();
		c3.real = c1.real+c1.real;
		c3.imag = c1.imag+c2.imag;
		return c3;
	}	
	void display() {
		System.out.println("The complex number is: "+real+"+"+imag);
	}
}
public class Q2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Complex c1 = new Complex();
		c1.setData();
		Complex c2 = new Complex();
		c2.setData();
		Complex res = c1.add(c1,c2);
		res.display();
	}
}