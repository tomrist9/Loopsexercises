package exercise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionsExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter the first integer: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter the second integer: ");
            int num2 = scanner.nextInt();

            if (num2 == 0) {
                System.out.println("Division by zero is not allowed.");
            } else {

                System.out.println("Quotient: " + (num1 / num2));

            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter integers only.");
        } finally {
            scanner.close();
        }
    }
}





