package Package1;

class Student {
    String name;
    int roll;

    public void inputDetails(String name, int roll) {
        this.name = name;
        this.roll = roll;

    }

    void showDetails() {
        System.out.println("NAME: " + name);
        System.out.println("ROLL: " + roll);
    }

}

public class Test extends Student {
    public int mark1;
    public int mark2;

    public void inputDetails(int mark1, int mark2) {
        this.mark1 = mark1;
        this.mark2 = mark2;
    }

    public void showDetails() {
        super.showDetails();
        System.out.println("MARK 1: " + mark1);
        System.out.println("MARK 2: " + mark2);
    }

}