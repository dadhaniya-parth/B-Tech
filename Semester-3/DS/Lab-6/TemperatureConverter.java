// 36. Create methods to convert temperature from Celsius to Fahrenhit and vice versa.
// Take temperature input from user and call the appropriate conversion method.

import java.util.Scanner;

public class TemperatureConverter {

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose conversion type:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.print("Enter temperature in Celsius: ");
            double celsius = sc.nextDouble();
            double fahrenheit = celsiusToFahrenheit(celsius);
            System.out.println(celsius + " °C is equal to " + fahrenheit + " °F");
        } else if (choice == 2) {
            System.out.print("Enter temperature in Fahrenheit: ");
            double fahrenheit = sc.nextDouble();
            double celsius = fahrenheitToCelsius(fahrenheit);
            System.out.println(fahrenheit + " °F is equal to " + celsius + " °C");
        } else {
            System.out.println("Invalid choice.");
        }
        sc.close();
    }
}
