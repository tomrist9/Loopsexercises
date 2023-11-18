package exercise;
import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the rhombus: ");
        int size = scanner.nextInt();

        if (size % 2 == 0) {
            System.out.println("Please enter an odd number for the rhombus size.");
        } else {
            drawCharacterRhombus(size);
        }
    }

    public static void drawCharacterRhombus(int size) {
        int mid = (size + 1) / 2;
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = size - 1; i >= 1; i--) {
            for (int j = 1; j <= size - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


}