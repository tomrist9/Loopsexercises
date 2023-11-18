package exercise;

import java.util.Random;

public class RandomGenerateNumbers {

    public static void main(String[] args) {

            int[] numbers = generateRandomNumbers(1, 150, 10);

            // Get the count of each number
            int[] result = countNumbers(numbers);

            // Print the result
            for (int i = 0; i < result.length; i++) {
                int count = result[i];
                System.out.println((i + 1) + " - " + count);
            }
        }

        public static int[] generateRandomNumbers(int min, int max, int count) {
            int[] result = new int[count];
            Random random = new Random();

            for (int i = 0; i < count; i++) {
                result[i] = random.nextInt(max - min + 1) + min;
            }

            return result;
        }

        public static int[] countNumbers(int[] numbers) {
            int[] numberCounts = new int[150];

            for (int number : numbers) {
                numberCounts[number - 1]++;
            }

            return numberCounts;
        }
    }


