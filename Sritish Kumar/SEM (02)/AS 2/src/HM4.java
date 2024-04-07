class Distance {
    int meters;
    int centimetres;

    Distance(int m, int cm) {

        if (cm >= 100) {
            m += (cm / 100);

        }
        cm = cm % 100;
        this.meters = m;
        this.centimetres = cm;
        // System.out.println(m + " " + cm);
    }

    void display() {
        System.out.println("Meters: " + meters + "\nCentimeters: " + centimetres);
    }

    Distance add(Distance d1, Distance d2) {
        int meters = d1.meters + d2.meters;
        int cm = d1.centimetres + d2.centimetres;
        Distance d = new Distance(meters, cm);
        return d;

    }

}

public class HM4 {
    public static void main(String[] args) {
        Distance d1 = new Distance(20, 450);
        Distance d2 = new Distance(10, 150);
        System.out.println("\nDistance 1 ");
        d1.display();
        System.out.println("\nDistance 2 ");
        d2.display();
        System.out.print("\nAdded Distances: ");
        d1.add(d1, d2).display();

    }

}

// OUTPUTS:
// Distance 1
// Meters: 24
// Centimeters: 50

// Distance 2
// Meters: 11
// Centimeters: 50
// Added Distances: Meters: 36
// Centimeters: 0