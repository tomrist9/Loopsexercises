package exercise;

public class CalculateFactorial {
    public static void main(String[] args) {
     int number=5;
     int result=factorial(number);

        System.out.println(result);
    }

    public static int factorial(int n) {

        if (n == 0) {
            return 1;
        }
        return n==0?1:n * factorial(n - 1);
    }
}
