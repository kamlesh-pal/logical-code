package kk.it.collection;

import java.util.HashMap;
import java.util.Map;

public class MapIterationTest {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1, "kamlesh kumar");
        hm.put(2, "mahesh kumar");
        hm.put(3, "dinesh kumar");
        hm.put(4, "rajesh kumar");
        hm.put(5, "akhilesh kumar");
        hm.put(6, "ankur kumar");
        hm.put(7, "ankit kumar");
        System.out.println(hm);

        for (Map.Entry<Integer, String> entry : hm.entrySet()) {
            System.out.println(entry.getKey() + ":: " + entry.getValue());
        }
    }
}
