package kk.it.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FindAllEvenNumberUsingStreamAPI {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(){{
            add(10);
            add(15);
            add(8);
            add(49);
            add(25);
            add(98);
            add(32);
        }};
        List<Integer> evenNumberList = list.stream().filter(num -> num%2==0).collect(Collectors.toList());
        System.out.println("=============>>"+ evenNumberList);
    }
}
