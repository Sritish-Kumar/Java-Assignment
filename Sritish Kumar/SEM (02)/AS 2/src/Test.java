class Deposit1 {
    long principal;
    int time;
    double rate;

    Deposit1() {
        System.out.println("Waiting for ");
    }

    Deposit1(long principal, int time) {
        this();
        this.principal = principal;
    }

    Deposit1(long principal, double rate) {
        this(principal, 1);
        this.rate = rate;
    }

    Deposit1(long principal, int time, double rate) {
        this(principal, rate);
        this.time = time;
    }

    void show() {
        System.out.println("p " + principal);
        System.out.println("r " + rate);
        System.out.println("t " + time);
    }

}

public class Test {
    public static void main(String[] args) {
        Deposit1 d = new Deposit1();
        d.show();

    }

}
