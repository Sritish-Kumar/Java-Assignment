
public class Cmd4 {
	public static void main(String[] args) {
		int min = 1;
		int max = 6;
		int rand1 = (int) (min + (max - min + 1) * Math.random());
		int rand2 = (int) (min + (max - min + 1) * Math.random());
		System.out.println("Number one " + rand1 + " Number two " + rand2 + " Sum " + (rand1 + rand2));

	}

}
