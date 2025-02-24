import java.util.Scanner;

public class FuelEfficiencyCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double gallons = -1;
        double mpg = -1;
        double pricePerGallon = -1;

        // Ask for the number of gallons of gas in the tank
        do {
            System.out.print("Enter the number of gallons of gas in the tank: ");
            if (scanner.hasNextDouble()) {
                gallons = scanner.nextDouble();
                if (gallons <= 0) {
                    System.out.println("Please enter a positive value for gallons.");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // Clear the invalid input
            }
        } while (gallons <= 0);

        // Ask for the fuel efficiency in miles per gallon
        do {
            System.out.print("Enter the fuel efficiency in miles per gallon: ");
            if (scanner.hasNextDouble()) {
                mpg = scanner.nextDouble();
                if (mpg <= 0) {
                    System.out.println("Please enter a positive value for miles per gallon.");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // Clear the invalid input
            }
        } while (mpg <= 0);

        // Ask for the price of gas per gallon
        do {
            System.out.print("Enter the price of gas per gallon: ");
            if (scanner.hasNextDouble()) {
                pricePerGallon = scanner.nextDouble();
                if (pricePerGallon <= 0) {
                    System.out.println("Please enter a positive value for price per gallon.");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // Clear the invalid input
            }
        } while (pricePerGallon <= 0);

        // Calculate the cost to drive 100 miles
        double costToDrive100Miles = (100 / mpg) * pricePerGallon;
        // Calculate how far the car can go with a full tank
        double milesWithFullTank = gallons * mpg;

        // Output the results
        System.out.println("\n--- Results ---");
        System.out.println("Cost to drive 100 miles: $" + costToDrive100Miles);
        System.out.println("Distance the car can travel with a full tank: " + milesWithFullTank + " miles");

        scanner.close();
    }
}
