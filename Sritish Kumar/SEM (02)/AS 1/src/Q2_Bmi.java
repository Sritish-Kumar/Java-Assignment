// The body mass index (BMI) is commonly used by health and nutrition professionals to estimate human body fat in populations. It is computed by taking the individual's weight (mass) in kilograms and dividing it by the square of their height in meters. i.e.
// Metric: BMI = 𝑾𝒆𝒊𝒈𝒉𝒕 (𝒌𝒈)/(𝑯𝒆𝒊𝒈𝒉𝒕)𝟐 (𝒎𝟐)

import java.util.Scanner;

public class Q2_Bmi {
    static void bmi(float weight, float height) {
        float index = weight / (height * height);

        if (index < 18.5) {
            System.out.println("UnderWeight");

        } else if (18.5 < index && index < 24.9) {
            System.out.println("Normal Weight");

        } else if (25 < index && index < 29.9) {
            System.out.println("Overweight");

        } else if (index > 30.0) {
            System.out.println("Obese");

        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Weight: ");
        float weight = scan.nextFloat();

        System.out.print("Height: ");
        float height = scan.nextFloat();

        bmi(weight, height);
        scan.close();

    }

}
