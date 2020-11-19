package stream.example;

import java.util.Arrays;
import java.util.List;

public class UseStream {
    public static void main(String[] args) {
        List<String> listex = Arrays.asList("Mango", "Banana", "Berries", "Watermelon");

        System.out.println("Iterating using for loop");
        for (String fruit : listex) {
            if (fruit.startsWith("B")) {
                System.out.println(fruit);
            }
        }
        System.out.println("Iterating using stream");
        listex.stream().filter((fruit->fruit.startsWith("B"))).forEach(fruit-> System.out.println(fruit));
    }
}
