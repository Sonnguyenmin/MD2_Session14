package homework.bai1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(50);
        list.add(4);
        list.add(5);

//        //max cua list
//        Integer max = list.stream().max(Comparator.comparing(Integer::intValue)).get();
//        System.out.println("max = " + max);
//
//        //so chan
//        System.out.println("So chan ");
//        list.stream().filter(number -> number %2 ==0).forEach(System.out::println);

//        //so sanh list voi 1 so bat ki
//        System.out.println("Nhap so de so sanh voi list");
//        Scanner sc = new Scanner(System.in);
//        Integer n = Integer.parseInt(sc.nextLine());
//        System.out.println("So cac so nho hon so");
//        list.stream().filter(number -> number >= n).forEach(System.out::println);


        //tinh tong cua danh sach
        Integer sum = list.stream().reduce(0, Integer::sum);
        System.out.println("Sum = " + sum);

        //anyMatch de check xem dsach co chua it nhat 1 so chan hay ko
        boolean anyMatchCcheck =  list.stream().anyMatch(number -> number %2 ==0);
        System.out.println(anyMatchCcheck);

        //range
        List<Integer> range = list.stream().skip(0).limit(list.size()).collect(Collectors.toList());
        System.out.println(range);

        //sort nguoc
        System.out.println("sort reverse");
        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
        System.out.println("sort natural order");
        list.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);

        List<String> list2 = new ArrayList<String>();
        list2.add("a");
        list2.add("c");
        list2.add("b");
        list2.add("d");
        list2.add("e");

        //sort nguoc
        System.out.println("sort reverse cba");
//        list2.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
        String result = list2.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining(","));
        System.out.println(result);
        System.out.println("sort natural order abc");
        result = list2.stream().sorted(Comparator.naturalOrder()).collect(Collectors.joining(","));
        System.out.println(result);

        System.out.println("chuyen sang chu hoa");
        //list2.stream().map(cha->cha.toUpperCase()).forEach(System.out::println);
        result = list2.stream().map(String::toUpperCase).collect(Collectors.joining(","));
        System.out.println(result);
    }
}
