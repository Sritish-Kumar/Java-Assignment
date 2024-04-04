import java.util.Scanner;

class Person {
    int age;
    String name;

    void setData() {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the name: ");
        name = scan.nextLine();
        System.out.print("Enter the age: ");
        age = scan.nextInt();

        scan.close();

    }

    void displayData() {
        System.out.println();
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

}

public class Q1 {
    public static void main(String[] args) {

        Person p1 = new Person();
        p1.name = "Rohan";
        p1.age = 20;

        Person p2 = new Person();
        p2.setData();
        p1.displayData();
        p2.displayData();
        if (p1.age > p2.age) {
            System.out.println(p2.name + " Is younger");

        } else {
            System.out.println(p1.name + " is younger");
        }

    }
}

// Output - - - - - - - - - - - - - - - -
// Enter the name: Sritish
// Enter the age: 25

// Name: Rohan
// Age: 20

// Name: Sritish
// Age: 25
// Rohan is younger
