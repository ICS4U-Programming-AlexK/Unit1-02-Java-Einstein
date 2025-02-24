/**
 * @author  Alex Kapajika
 * @version 1.0
 * @since   2025-02-20
 */import java.util.Scanner;

public class Einstein {
    public static void main(String[] args) {
        // Define the speed of light as a constant
        final double SPEED_OF_LIGHT = 2.998e8; // in meters per second (m/s)
        
        // User input
        Scanner scanner = new Scanner(System.in);
        
        // Variable to store mass
        double mass = 0;
        
        // Prompt the user and handle potential input errors
        while (true) {
            try {
                System.out.print("Enter the mass of the object in kg: ");
                mass = Double.parseDouble(scanner.nextLine());
                if (mass < 0) {
                    System.out.println("Mass cannot be negative. Please enter a valid mass.");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a numerical value.");
            }
        }
        
        // Calculate energy using E = mc^2
        double energy = mass * Math.pow(SPEED_OF_LIGHT, 2);
        
        // Display the result formatted to 3 decimal places
        System.out.printf("The energy released is %.3e Joules.%n", energy);
        
        scanner.close();
    }
}
