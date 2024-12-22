public class Q4 {
    public static void main(String[] args) {
        boolean flag = true;

        Boolean flag_autoboxed = flag;
        System.out.println("Auto boxing: " + flag_autoboxed);

        Boolean flag_constructor = new Boolean(flag);
        System.out.println("Using Constructor: " + flag_constructor);

    }

}
