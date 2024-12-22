public class Q2 {
    public static void main(String[] args) {
        float num = 12.2f;
        Float num_autoboxed = num;
        System.out.println("Auto boxing: " + num_autoboxed);

        Float num_constructor = new Float(num);
        System.out.println("Using Constructor: " + num_constructor);

    }
}
