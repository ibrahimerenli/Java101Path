import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {

        double weight, height, result;
        try (var input = new Scanner(System.in)) {
            System.out.print("Please enter your weight (kg): ");
            weight = input.nextDouble();
            System.out.print("Please enter your height (m): ");
            height = input.nextDouble();
        }
        result = weight / Math.pow(height,2);
        System.out.println("Your body mass index: "+ result);
    }
}