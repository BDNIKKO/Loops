import java.util.Scanner;

public class PositiveNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = -1;

        while (number < 0) {
            System.out.println("Enter a number:");
            number = scanner.nextInt();
        }

        System.out.println("You entered a positive number: " + number);
        scanner.close();
    }
}
