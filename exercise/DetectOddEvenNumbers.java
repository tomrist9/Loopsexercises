package exercise;

public class DetectOddEvenNumbers {
    public static void main(String[] args) {


        int a = 1562;

        boolean result = checkEventDigits(a);
        System.out.println(result);
    }


    public static boolean checkEventDigits(int num) {

        String str = String.valueOf(num);

        for (char digit : str.toCharArray()) {
            int digitInt = Character.getNumericValue(digit);


            if (digit % 2 != 0) {
                return false;
            }
        }
        return true;
    }

}
