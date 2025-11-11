package Task5;

import java.util.List;
import java.util.stream.Collectors;

public class sol3 {
    public static void main(String[] args) {
        List<String> names = List.of("Tim", "Adam","Sarah","Abby","Sam","Ali","Anne","Ben","John","Alina");

        List<String> namesWithA = names.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());

        System.out.println("The students whose name begins wth A : " + namesWithA);
    }
}
