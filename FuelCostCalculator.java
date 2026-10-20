import java.util.Locale;
import java.util.Scanner;

public class FuelCostCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Calculate fuel cost per 100 miles and driving range.");
        System.out.print("Enter gallons in a full tank (decimal number): ");
        double tankGallons = input.nextDouble();
        System.out.print("Enter fuel efficiency in miles per gallon (decimal number): ");
        double milesPerGallon = input.nextDouble();
        System.out.print("Enter price per gallon (decimal number): ");
        double pricePerGallon = input.nextDouble();
        System.out.printf(Locale.US, "Cost per 100 miles: $%.2f%n", 100.0 / milesPerGallon * pricePerGallon);
        System.out.printf(Locale.US, "Full-tank driving range: %.2f miles%n", tankGallons * milesPerGallon);
    }
}
