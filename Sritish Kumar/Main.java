public class Main {
    public static void main(String[] args) {
        CircularQueue list = new CircularQueue(5);

        try {
            list.insert(10);
            list.insert(20);
            list.insert(30);
            list.insert(40);
            list.insert(50);
            list.print();

            list.delete();
            list.delete();

            list.insert(60);
            list.insert(70);
            list.insert(80);
            list.print();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
