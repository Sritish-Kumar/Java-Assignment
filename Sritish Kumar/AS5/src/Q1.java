public class Q1 {
    public static void main(String[] args) {

        int num = 10;
        Integer num_auto = num;
        System.out.println("Auto boxing: " + num_auto);

        Integer num_auto_constructor = new Integer(num);
        System.out.println("Using Constructor: " + num_auto_constructor);

    }

}