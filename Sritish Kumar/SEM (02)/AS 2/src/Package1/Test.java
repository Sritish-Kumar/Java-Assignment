package Package1;

class Student {
    String name;
    int roll;

    void inputDetails(String name, int roll) {
        this.name = name;
        this.roll = roll;

    }

    void showDetails() {
        System.out.println("NAME: " + name);
        System.out.println("ROLL: " + roll);
    }

}

class Test extends Student {
    int mark1;
    int mark2;

    void inputDetails(int mark1, int mark2) {
        this.mark1 = mark1;
        this.mark2 = mark2;
    }

    void showDetails() {
        super.showDetails();
        System.out.println("MARK 1:" + mark1);
        System.out.println("MARK 2:" + mark2);
    }

}

// Design a package that contains two classes Student & Test. The Student class
// has
// data members as name, roll and instance methods inputDetails() &
// showDetails().
// Similarly the Test class has data members as mark1, mark2 and instance
// methods
// inputDetails(), showDetails(), Student is extended by Test. Another package
// carry
// interface Sports with 2 attributes score1, score2. Find grand total mark &
// score in
// another class.
