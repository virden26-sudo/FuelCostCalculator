import java.util.Locale;
import java.util.Scanner;

public class FuelCostCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Calculate fuel cost per 100 miles and driving range.");
        System.out.print("Enter gallons in a full tank (decimal number): ");
        double tankGallons = readNumber(input, "Tank gallons", true);
        System.out.print("Enter fuel efficiency in miles per gallon (decimal number): ");
        double milesPerGallon = readNumber(input, "Miles per gallon", false);
        System.out.print("Enter price per gallon (decimal number): ");
        double pricePerGallon = readNumber(input, "Price per gallon", true);
        System.out.printf(Locale.US, "Cost per 100 miles: $%.2f%n", 100.0 / milesPerGallon * pricePerGallon);
        System.out.printf(Locale.US, "Full-tank driving range: %.2f miles%n", tankGallons * milesPerGallon);
    }

    private static double readNumber(Scanner input, String label, boolean allowZero) {
        if (!input.hasNextDouble()) {
            System.err.println("Error: " + label + " must be a decimal number.");
            System.exit(1);
        }
        double value = input.nextDouble();
        if (!Double.isFinite(value) || value < 0 || (!allowZero && value == 0)) {
            System.err.println("Error: " + label + " must be finite and "
                    + (allowZero ? "zero or greater." : "greater than zero."));
            System.exit(1);
        }
        return value;
    }

}
