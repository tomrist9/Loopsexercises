package exercise;
import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;

import static java.lang.Long.sum;
import static java.lang.System.*;
import static java.util.Locale.filter;

public class FunctionalProgramming {


        public static void main (String[]args)
        {
            List<Integer> numbers
                    = Arrays.asList(11, 22, 33, 44,
                    55, 66, 77, 88,
                    99, 100);

            System.out.println(
                    numbers.stream()
                            .filter(number -> number % 2 == 0)
                            .mapToInt(e -> e * 2)
                            .sum());
        }
    
}
