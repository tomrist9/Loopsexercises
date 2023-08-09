package exercise;

public class ArraySnake2D {

        public static void printSnake(int[][] array) {
            int rows = array.length;

            for (int i = 0; i < rows; i++) {
                int cols = array[i].length;
                int jStart = (i % 2 == 0) ? 0 : cols - 1;
                int jEnd = (i % 2 == 0) ? cols : -1;
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


