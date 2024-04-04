abstract class Marks {
    float markICP;
    float markDSA;
    float percentage;

    abstract float getPercentage();
}

class CSE extends Marks {
    float algoDesign;

    CSE(float markICP, float markDSA, float algoDesign) {
        this.markICP = markICP;
        this.markDSA = markDSA;
        this.algoDesign = algoDesign;

    }

    @Override
    float getPercentage() {
        percentage = ((markICP + markDSA + algoDesign) / 300) * 100;
        return percentage;
    }

}

class NonCSE extends Marks {
    float enggMechanics;

    NonCSE(float markICP, float markDSA, float enggMechanics) {
        this.markICP = markICP;
        this.markDSA = markDSA;
        this.enggMechanics = enggMechanics;
    }

    @Override
    float getPercentage() {
        percentage = ((markICP + markDSA + enggMechanics) / 300) * 100;
        return percentage;

    }
}

public class Q6 {
    public static void main(String[] args) {
        System.out.println("CSE");
        Marks s1 = new CSE(90, 85, 80);
        System.out.println("Percentage: " + s1.getPercentage() + "%");
        System.out.println("NON CSE");
        Marks s2 = new NonCSE(60, 40, 85);
        System.out.println("Percentage: " + s2.getPercentage() + "%");
    }
}

// OUTPUTS ----------------------------------
// CSE
// Percentage: 85.0%
// NON CSE
// Percentage: 61.666668%