import java.util.Scanner;

public class main {

    public static double FahrenheitToCelsius() {
        Scanner input = new Scanner(System.in);
        double celsius;
        double fahrenheit = input.nextDouble();

        celsius = (fahrenheit - (double)32) / 1.8;
        return celsius;
    }
    public static void main(String[] args) {
        System.out.print("Enter Fahrenheit: ");
        double celsius = FahrenheitToCelsius();

        System.out.printf("Output: %1.2f Celsius", celsius);
        System.out.println("");
    }
}