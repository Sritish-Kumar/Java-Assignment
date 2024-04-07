class PointType {
    int x;
    int y;

    PointType(int x, int y) {
        this.x = x;
        this.y = y;

    }

    void show() {
        System.out.println("(" + x + "," + y + ")");
    }

    int getX() {
        return x;
    }

    int getY() {
        return y;
    }
}

class CircleType extends PointType {
    int radius;

    CircleType(int radius, int x, int y) {
        super(x, y);
        this.radius = radius;
    }

    void show() {
        System.out.println("Radius: " + radius);
        System.out.println("Center: " + getX() + ", " + getY());
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
    }

    float getArea() {
        float area = (float) (Math.PI * Math.pow(radius, 2));
        return area;
    }

    float getPerimeter() {
        float peri = (float) Math.PI * 2 * radius;
        return peri;
    }

}

public class HM5 {
    public static void main(String[] args) {
        CircleType c = new CircleType(4, 2, 3);
        c.show();

    }
}

// OUTPUT : -----------------------------------------
// Radius: 4
// Center: 2, 3
// Area: 50.265484
// Perimeter: 25.132742
