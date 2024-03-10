public class Cmd3 {
	public static void main(String[] args) {
		// ans in radians
		double t = Math.toRadians(Double.parseDouble(args[0]));
		System.out.println(Math.sin(t * 7) + Math.cos(t * 5));

	}

}
