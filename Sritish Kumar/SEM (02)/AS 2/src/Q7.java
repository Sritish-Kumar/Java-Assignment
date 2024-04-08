interface Test1 {

    void display();

    void count();

}

class Person2 implements Test1 {
    static int maxcount;

    String name;

    Person2(String name) {
        this.name = name;

    }

    public void display() {
        System.out.println(name);

    }

    public void count() {
        maxcount = name.length();
    }

}

public class Q7 {
    public static void main(String[] args) {
        Person2 p = new Person2("Gilfoyle");
        p.display();
        p.count();
        System.out.println("Length: " + Person2.maxcount);
    }

}

// OUTPUT
// Gilfoyle
// Length: 8
