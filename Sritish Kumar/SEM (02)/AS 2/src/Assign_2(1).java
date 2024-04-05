package dsa_iter;
import java.util.Scanner;

class Student{
	String name;
	int roll;
	void inputDetails(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name: ");
		this.name = sc.next();
		System.out.print("Enter roll_no: ");
		this.roll = sc.nextInt();
	}
	void showDetails(){
		System.out.println("Name: "+this.name);
		System.out.println("Roll_No: "+this.roll);
	}
}
class Test extends Student{
	int mark1;
	int mark2;
	void inputDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your mark1: ");
		this.mark1 = sc.nextInt();
		System.out.print("Enter your mark2: ");
		this.mark2 = sc.nextInt();
	}
	void showDetails(){
		System.out.println("Mark1: "+this.mark1);
		System.out.println("Mark2: "+this.mark2);
	}
}
public class Q8{
	public static void main(String[] args) {
		Student s1 = new Student();
		Test t1 = new Test();
		s1.inputDetails();
		t1.inputDetails();
		s1.showDetails();
		t1.showDetails();
	}
}