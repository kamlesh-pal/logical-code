package kk.it.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateCharacterUsingStream {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "B", "C","D","A","B","C");
        //Get list without duplicate
        List<String> distictItems = list.stream().distinct().collect(Collectors.toList());
        System.out.println("Distinct Numbers ====>>>>"+ distictItems);
    }
}
