public class Q3 {
    public static void main(String[] args) {
        double num = 12.2;
        Double num_autoboxed = num;
        System.out.println("Auto boxing: " + num_autoboxed);

        Double num_constructor = new Double(num);
        System.out.println("Using Constructor: " + num_constructor);

    }
}
