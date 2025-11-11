package Task5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;

public class sol2 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("abc","","bc","efg","abcd","","jkl");

        List<String> strings = list.stream()
                                   .filter(s -> !s.isEmpty())
                                   .collect(Collectors.toList());

        System.out.println("Non emplty strngs are: " + strings);
    }
}
