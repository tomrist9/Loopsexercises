package lesson9;

public class PasswordValidator {



        public static void main(String[] args) {
            int rows = 5;
            printPyramidPattern(rows);
        }

        public static void printPyramidPattern(int rows) {
            int n = 1;
            int boshluq = rows - 1;

            for (int i = 1; i <= rows; i++) {
                for (int j = 1; j <= boshluq; j++) {
                    System.out.print(" ");
                }

                for (int k = 1; k <= i; k++) {
                    System.out.print(n + " ");
                }

                System.out.println();
                n++;
                boshluq--;
            }
        }
    }
