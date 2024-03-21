
public class CmdCylinder {
	public static void main(String[] args) {
		float r = Float.parseFloat(args[0]);
		float h = Float.parseFloat(args[1]);

		System.out.println(Math.PI * Math.pow(r, 2) + 2 * Math.PI * r * h);
	}

}
