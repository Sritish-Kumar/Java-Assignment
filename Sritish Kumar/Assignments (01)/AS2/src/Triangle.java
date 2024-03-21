
import java.util.Scanner;

public class Triangle {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the points: ");
		String st = scan.nextLine();
		String[] arr = st.split(" ");

		float p1x = Float.parseFloat(arr[0]);
		float p1y = Float.parseFloat(arr[1]);

		float p2x = Float.parseFloat(arr[2]);
		float p2y = Float.parseFloat(arr[3]);

		float p3x = Float.parseFloat(arr[4]);
		float p3y = Float.parseFloat(arr[5]);

		// System.out.println("1 "+p1x+p1y+" "+"2 "+p2x+p2y+" "+"3 "+p3x+p3y);

		float s1 = (float) Math.sqrt((Math.pow((p2y - p1y), 2)) + (Math.pow((p2x - p1x), 2)));
		float s2 = (float) Math.sqrt((Math.pow((p3y - p2y), 2)) + (Math.pow((p3x - p2x), 2)));
		float s3 = (float) Math.sqrt((Math.pow((p3y - p1y), 2)) + (Math.pow((p3x - p1x), 2)));

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		float s = (s1 + s2 + s3) / 2;

		float area = (float) Math.sqrt((s * (s - s1) * (s - s2) * (s - s3)));
		System.out.println("Area of the traingle: " + area);
		scan.close();

	}
}
