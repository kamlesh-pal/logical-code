package kk.it.string;

import java.util.Arrays;

public class AnagramTest {
    public static boolean anagram(String first, String second){
        String firstString= first.toUpperCase();
        String secondString= second.toUpperCase();
        char[] firstArray=firstString.toCharArray();
        char[] secondArray=secondString.toCharArray();
        Arrays.sort(firstArray);
        Arrays.sort(secondArray);
        return Arrays.equals(firstArray ,secondArray);

    }
    public static void main(String[] args) {
        System.out.println(AnagramTest.anagram("Hello", "lloeH"));
    }
}
