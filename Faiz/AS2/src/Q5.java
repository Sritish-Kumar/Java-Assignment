package src;

class Aadmi {
	String name;
	int age;

	Aadmi(String naam, int umr) {
		this.name = naam;
		this.age = umr;
	}
}

class Employee extends Aadmi {
	int Eid;
	double salary;

	Employee(String n, int um, int id, double tankha) {
		super(n, um);
		this.Eid = id;
		this.salary = tankha;
	}

	void empDisplay() {
		System.out.println("Employee Name: " + this.name);
		System.out.println("Employee Age: " + this.age);
		System.out.println("Employee ID: " + this.Eid);
		System.out.println("Employee Salary: " + this.salary);
	}
}

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee("Stark", 24, 7819, 20000000);
		emp.empDisplay();
	}

}
