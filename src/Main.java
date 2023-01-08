import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scans the five-digit number.
        Scanner scanner = new Scanner(System.in);

        // Values of each digit.
        int tenThousands, thousands, hundreds, tens, ones;

        // Scans the number.
        int number = scanner.nextInt();

        // Checks if the entered number has more than 5 digits.
        if (number > 99999) {
            System.out.println("Error! Number more than 5 digits.");
        }

        // Checks if the entered number has less than 5 digits.
        else if (number < 10000) {
            System.out.println("Error! Number less than 5 digits.");
        } else {
            // Stores the number at ones place.
            ones = number % 10;

            // Updates the number.
            number /= 10;

            // Stores the number at tens place.
            tens = number % 10;

            // Updates the number.
            number /= 10;

            // Stores the number at hundreds place.
            hundreds = number % 10;

            // Updates the number.
            number /= 10;

            // Stores the number at thousands place.
            thousands = number % 10;

            // Updates the number.
            number /= 10;

            // Stores the number at ten thousands place.
            tenThousands = number % 10;

            // Prints each digit.
            System.out.println(tenThousands);
            System.out.println(thousands);
            System.out.println(hundreds);
            System.out.println(tens);
            System.out.println(ones);
        }
    }
}