package kk.it.java8.lamda.exprssion;

import java.util.ArrayList;
import java.util.List;

public class SumOfAllNumberPresentInArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(50);
        list.add(5);
        list.add(20);
        list.add(30);
        list.add(80);
        list.add(990);
        System.out.println(sum(list));
    }
    public static int sum(ArrayList<Integer> list){
        return list.stream().mapToInt(num -> num).sum();
    }
}
