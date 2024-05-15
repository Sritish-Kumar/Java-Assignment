// Write a simple main class in Java that contains an experiment that uses the
// generic Box<T>
// class to build boxes with different types and that verifies that this class
// works as advertised.
// Your experiment should include the following:
//  Create a boxed String object and two variables that refer to that box.
// Change the contents
// of one and determine the effect on the other.
//  Create a boxed Integer object and two variables that refer to that box.
// Change the
// contents of one and determine the effect on the other.
//  Create a boxed Object object and two variables that refer to that box.
// Determine what
// happens if you put a string in the box. Determine what happens if you put an
// integer in
// the box.

class Box<T> {
    T obj;

    Box(T obj) {
        this.obj = obj;
    }

    T getObject() {
        return obj;
    }

}

/**
 * Q4
 */
public class Q4 {

    public static void main(String[] args) {
        Box<Integer> i1 = new Box<>(10);
        Box<Integer> i2 = i1;

        i2.obj = 12;

        System.out.println(i1.getObject());
        System.out.println(i2.getObject());

        Box<String> str1 = new Box<>("Yin Yang");
        Box<String> str2 = str1;

        str2.obj = "Gylfoile";

        System.out.println(str1.getObject());
        System.out.println(str2.getObject());

        Box<Object> ob1 = new Box<Object>(i1);
        Box<Object> ob2 = ob1;

        ob1.obj = 100;

        System.out.println(ob1.getObject());
        System.out.println(ob2.getObject());

        // Changes in the refrence varibales reflects in the main

    }
}