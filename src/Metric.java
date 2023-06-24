import java.util.Scanner;

public class Metric {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double meters;

        System.out.print("Enter a measurement in meters: ");
        while (true) {
            if (scanner.hasNextDouble()) {
                meters = scanner.nextDouble();
                break;
            } else {
                System.out.print("Invalid input. Please enter a valid numeric measurement: ");
                scanner.next();
            }
        }

        double miles = meters * 0.000621371;
        double feet = meters * 3.28084;
        double inches = meters * 39.3701;

        System.out.println(meters + " meters is equal to:");
        System.out.println(miles + " miles");
        System.out.println(feet + " feet");
        System.out.println(inches + " inches");
    }
}
