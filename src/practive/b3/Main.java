package practive.b3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("Apple meo meo");
        words.add("banana Wine");
        words.add("vodka Russia");
        words.add("all");

        System.out.println("Cac tu bat dau bang chu a va co do dai 3 ky tu");
        words.stream().filter(word -> word.startsWith("a") && word.length() == 3).forEach(System.out::println);
    }
}
