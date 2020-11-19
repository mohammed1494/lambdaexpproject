package method.reference;

import java.util.Arrays;
import java.util.List;

public class IterateList {
    public static void main(String[] args) {

        List<String> electronicex = Arrays.asList("Laptop", "Tablet", "Workstation", "Monitor ");
        electronicex.forEach(System.out::println);
        electronicex.forEach(Electronics::countWordLength);

    }
}