package kk.it.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FindAll_Number_starting_with_1_UsingStreamAPI {
    public static void main(String[] args) {
    /*    List<Integer> list = new ArrayList<>(){{
            add(10);
            add(20);
            add(100);
            add(40);
            add(1110);
            add(000);
            add(9870);
        }};
        List<String> sortedList = list.stream().map(num -> num + "").filter(number -> number.startsWith("1"))
                .collect(Collectors.toList());

        System.out.println("=====================>>>>>>>>>>>>>>>>"+sortedList);
    }
*/

//        String str = "KAMLESH";
//        String name = "";
//        char[] c = str.toCharArray();
//        for (int i =c.length-1 ; i < c.length; i--) {
//            name += c[i];
//        }
//        System.out.println(name);

//        String str = "KAMLESH";
//        String reverseStr= "";
//        for (int i =str.length()-1; i>=0; i--){
//            reverseStr +=str.charAt(i);
//        }
//        System.out.println(reverseStr);
     /*   String str = "KAMLESH";
        String reverseStr= "";
        for (int i =0; i<str.length(); i++){
            reverseStr =str.charAt(i) + reverseStr;
        }
        System.out.println(reverseStr);*/
        String str = "KAMLESH";
        char[] c= str.toCharArray();
        String emstr="";
        for (int i =0; i<c.length; i++){
            emstr=c[i]+ emstr;
        }
        System.out.println(emstr);
    }
}
