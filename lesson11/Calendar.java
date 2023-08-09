package lesson11;

import java.util.Objects;

public class Calendar {


        public static void printSnake(int[][] array) {
            int rows = array.length;
            int cols = array[0].length;

            for (int i = 0; i < rows; i++) {
                int jStart = 0;
                int jEnd = cols;

                if (i % 2 == 1) {
                    // Reverse the indices for odd rows
                    jStart = cols - 1;
                    jEnd = -1;
                }

                int jIncrement = (jStart < jEnd) ? 1 : -1;

                for (int j = jStart; j != jEnd; j += jIncrement) {
                    System.out.print(array[i][j] + " ");
                }

                System.out.println();  // Move to the next line after each row
            }
        }

        public static void main(String[] args) {
            // Example 2D array
            int[][] myArray = {
                    {1, 2, 3, 4},
                    {5, 6, 7, 8},
                    {9, 10, 11, 12},
                    {13, 14, 15, 16}
            };

            // Print the array in snake format
            printSnake(myArray);
        }
    }
