package kk.it.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class modificationError {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("One");
        arrayList.add("Two");
        arrayList.add("Three");
        arrayList.add("Four");
        System.out.println("ArrayList ::" + arrayList);
    try {
       Iterator<String> itr = arrayList.iterator();
       while (itr.hasNext()){
           System.out.println("Next Element :: " + itr.next());
           System.out.println(arrayList.add("Five"));
       }


    /*   while (itr.hasNext()) {
           System.out.println("Next Element :: " + itr.next());
       }

       //to solve the concurrent modification Exception add element into the arraylist after the iteration completed
       System.out.println(arrayList.add("Five"));

       Iterator<String> iterator = arrayList.iterator();
       while (iterator.hasNext()){
            System.out.println(iterator.next());
       }*/
} catch (Exception e){
    System.out.println(e);
}
    }
}
