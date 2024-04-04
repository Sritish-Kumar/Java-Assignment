interface Test1 {

    void display();

    void count();

}

class Person implements Test1 {
    static int maxcount;

    String name;

    Person(String name) {
        this.name = name;

    }

    public Person(String name2, int eid) {
        // TODO Auto-generated constructor stub
    }

    public void display() {
        System.out.println(name);

    }

    public void count() {
        char[] arr = name.toCharArray();
        maxcount = arr.length;
    }

}

public class Q7 {
    public static void main(String[] args) {
        Person p = new Person("Sritish");
        p.display();
        p.count();
        System.out.println(p.maxcount);
    }

}
