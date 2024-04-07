package Package2;

import Package1.Test;

interface Sports {
    int score1 = 10;
    int score2 = 2;

}

public class Q8 extends Test implements Sports {

    public static void main(String[] args) {

        Test t1 = new Test();
        t1.inputDetails(100, 98);
        t1.inputDetails("Gylfoile", 15);
        t1.showDetails();

        int totalMarks = t1.mark1 + t1.mark2;
        System.out.println("Total Marks: " + totalMarks);

        int totalScore = score1 + score2;
        System.out.println("Total Score: " + totalScore);

    }
}

// OUTPUT --------------------------------------------

// NAME: Gylfoile
// ROLL: 15
// MARK 1: 100
// MARK 2: 98
// Total Marks: 198
// Total Score: 12