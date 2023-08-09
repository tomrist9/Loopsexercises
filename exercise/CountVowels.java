package exercise;

public class CountVowels {
    public static void main(String[] args) {
        String text = "Sawdreu";

        countVowels(text);
    }

    public static void countVowels(String text) {
        char[] vowels = {'a', 'e', 'i', 'u', 'e', 'o'};
        int count = 0;

        for (char vowel : vowels) {
            if (text.contains(Character.toString(vowel))) {
                count++;
            }
        }

        if (count > 0) {
            System.out.println(count);
        } else {
            System.out.println("No vowels");
        }
    }
}