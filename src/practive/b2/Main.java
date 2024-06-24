package practive.b2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("So chan ");
        list.stream().filter(number -> number % 2 == 0).forEach(System.out::println);
    }
}
