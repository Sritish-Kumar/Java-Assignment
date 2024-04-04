abstract class Test {
    int n = 10;

    void display() {
        System.out.println("Noraml method");
    }

    abstract void print();
}

class sub extends Test {

    @Override
    void print() {
        System.out.println("Abstract method");
    }

    // void display() {
    // System.out.println("123");
    // }

    void show() {
        System.out.println("show working");
    }

}

public class Q6 {
    public static void main(String[] args) {
        sub t1 = new sub();
        t1.display();
        t1.print();
        t1.show();

    }
}
