class Rev {
    static int x = -55;

    public static void main(String[] args) {
        Rev ob1 = new Rev();
        ob1.x = ob1.x * 2 - 66;
        System.out.println(ob1.x);

        Rev ob2 = new Rev();
        ob2.x = ob2.x + 66;
        System.out.println(ob1.x + " " + ob2.x);

    }

    static {
        System.out.println(x);
    }

}