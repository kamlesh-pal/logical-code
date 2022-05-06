package kk.out.production.kk;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("kamlesh");
        list.add("kamlesh");
        list.add("Mahesh");
        list.add("Shakti");
        list.add("Akhilesh");
        list.removeIf(name -> name.contains("kamlesh"));
        System.out.println(list);
    }
}
