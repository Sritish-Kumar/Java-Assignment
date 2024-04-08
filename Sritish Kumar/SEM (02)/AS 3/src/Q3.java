// creating a custom Exception From Exception class
class MarksOutOfBoundException extends Exception {
    public MarksOutOfBoundException(String str) {
        super(str);
    }
}

class Student {
    int mark;
    String name;

    Student(String name, int mark) throws MarksOutOfBoundException {
        this.name = name;
        if (mark > 100) {
            throw new MarksOutOfBoundException(" Invalid Mark cant be more than 100");
        }
        this.mark = mark;
    }
}

public class Q3 {
    public static void main(String[] args) {
        try {
            Student s = new Student("Jin Yang", 100);
            System.out.println("Name: " + s.name);
            System.out.println("Marks: " + s.mark);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}

// OUTPUTS
// Error: Invalid Mark cant be more than 100

// Name: Jin Yang
// Marks: 100
