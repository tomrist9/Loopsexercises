package lesson12;

import java.util.ArrayList;
import java.util.List;

public class CustomList {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Red");
        stringList.add("Green");
        stringList.add("Orange");
        stringList.add("White");
        stringList.add("Black");

        String element = "Red";
         stringList.stream()
                .filter(it-> it == element).forEach(System.out::println);


    }
    }



