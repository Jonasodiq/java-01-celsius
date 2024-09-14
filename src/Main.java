// 4 sep 2024 Jonas N Lesson-1 Fahrenheit converts to Celsius
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double fahrenheit;

        Scanner sc = new Scanner(System.in);
        System.out.println("Skriv in temperaturen i Fahrenheit!");

        // Validates if the input is a valid number
        while (!sc.hasNextDouble()) {
            System.out.println("Ogiltig inmatning! Ange ett giltigt numeriskt värde.");
            sc.next(); // Ignores incorrect input
        }

        fahrenheit = sc.nextDouble();

        // Convert from Fahrenheit to Celsius
        double celsius = (fahrenheit - 32) / 1.8;

        // Formatted printout of the Celsius value with 2 decimal places
        System.out.printf("Temperaturen i Celsius är: %.2f\n", celsius);

        // Check temperature and provide feedback
        if (celsius > 25) {
            System.out.println("Det är varmt");
        } else if (celsius < 0) {
            System.out.println("Det är kallt");
        } else {
            System.out.println("Det är lagom");
        }
        sc.close();
    }
}
