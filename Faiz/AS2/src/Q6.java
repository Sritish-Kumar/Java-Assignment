package src;

abstract class Marks {
	int markICP;
	int markDSA;
	float percentage;

	abstract void getPercentage();
}

class CSE extends Marks {
	int algoDesign;

	CSE(int icp, int dsa, int alg) {
		this.markICP = icp;
		this.markDSA = dsa;
		this.algoDesign = alg;
	}

	void getPercentage() {
		int sum = markICP + markDSA + algoDesign;
		double percent = (sum * 100) / 300;
		System.out.println("You got " + percent + "% in CSE subject");
	}

}

class NonCSE extends Marks {
	int enggMechanics;

	NonCSE(int icp, int dsa, int engg) {
		this.markICP = icp;
		this.markDSA = dsa;
		this.enggMechanics = engg;
	}

	void getPercentage() {
		int sum = markICP + markDSA + enggMechanics;
		double percent = (sum * 100) / 300;
		System.out.println("You got " + percent + "% in NonCSE subject");
	}
}

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CSE stu1 = new CSE(80, 90, 100);
		stu1.getPercentage();

		NonCSE stu2 = new NonCSE(75, 85, 90);
		stu2.getPercentage();
	}

}
