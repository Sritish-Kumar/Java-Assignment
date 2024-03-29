
public class CmdSI {
	public static void main(String[] args) {
		// p , r , t
		double p = Double.parseDouble(args[0]);
		double r = Double.parseDouble(args[1]) / 100;
		double t = Double.parseDouble(args[2]);
		System.out.println(p + " " + r + " " + t);
		System.out.println("SIMPLE INTERSET: " + (p * r * t));

	}

}
