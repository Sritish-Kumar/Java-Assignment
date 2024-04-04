class Person1 {
    String name;
    int age;

    Person1(String str, int n) {
        this.name = str;
        this.age = n;

    }
}

class Employee extends Person1 {
    int eid;
    double salary;

    Employee(String name, int age, int eid, double salary) {
        super(name, age);
        this.eid = eid;
        this.salary = salary;

    }

    void empDisplay() {
        System.out.println("Employee Id: " + eid);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }

}

public class Q5 {
    public static void main(String[] args) {
        Employee p1 = new Employee("Eric Bachman", 41, 696, 1000000.00);
        p1.empDisplay();

    }
}

// OUTPUTS ----------------------------------
// Employee Id: 696
// Name: Eric Bachman
// Age: 41
// Salary: 1000000.0
