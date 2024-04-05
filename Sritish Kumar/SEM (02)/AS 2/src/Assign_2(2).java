package dsa_iter;
import java.util.Scanner;
class Person{
	String name;
	int age;
	void setData() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name: ");
		name = sc.next();
		System.out.print("Enter age: ");
		age = sc.nextInt();
	}
	void setData(String st,int ag) {
		this.name = st;
		this.age = ag;
	}

	void display() {
		System.out.println("Name is :"+name+" with age: "+age);
	}
}
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person();
		p1.name = "Rohan";
		p1.age = 18;
		p1.display();
		Person p2 = new Person();
		p2.setData("robert",34);
		p2.display();
		if(p1.age<p2.age)System.out.println(p1.name+" is younger");
		else System.out.print(p2.name+" is younger");
	}

}
