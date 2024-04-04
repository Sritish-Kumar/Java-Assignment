// Wap to add two complex number. Define a complex class with real img as fields and appropriate methods needed.

import java.util.Scanner;

class Complex {
    float real;
    float img;

    Scanner scan = new Scanner(System.in);

    public void setData() {

        System.out.print("Enter the real part: ");
        real = scan.nextFloat();

        System.out.print("Enter the imaginary part: ");
        img = scan.nextFloat();

    }

    public void display() {
        System.out.println("Num: " + real + "+" + img + "i ");

    }

    public Complex add(Complex a, Complex b) {
        Complex c = new Complex();
        c.real = a.real + b.real;
        c.img = a.img + b.img;
        return c;
    }

}

public class Q2 {
    public static void main(String[] args) {

        Complex n1 = new Complex();
        n1.setData();
        n1.display();

        Complex n2 = new Complex();
        n2.setData();
        n2.display();
        System.out.print("Added ");
        n1.add(n1, n2).display();

    }
}

// OUTPUT --------------------------------------------
// Enter the real part: 1
// Enter the imaginary part: 1
// Num: 1.0+1.0i

// Enter the real part: 1
// Enter the imaginary part: 1
// Num: 1.0+1.0i

// Added Num: 2.0+2.0i
