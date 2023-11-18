import java.util.Scanner;

public class TaskForOdd {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] arr = new int[6][6]; // Create a 6x6 2D array

        // Read input and populate the array
        try {
            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 6; j++) {
                    arr[i][j] = scanner.nextInt();
                }
            }
        } catch (Exception e) {
            System.out.println("Invalid input format. Please provide 6 rows of 6 integers separated by spaces.");
            return;
        }

        // Calculate the maximum hourglass sum
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int sum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2]
                        + arr[i + 1][j + 1]
                        + arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
                maxSum = Math.max(maxSum, sum);
            }
        }

        // Print the maximum sum
        System.out.println(maxSum);

    }


    // Prints each sequential element in array a

    }

