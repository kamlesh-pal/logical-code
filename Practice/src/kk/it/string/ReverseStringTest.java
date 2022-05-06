package kk.it.string;

public class ReverseStringTest {
//    public static void main(String[] args) {
//        String str = "Java Programming";
//        String emptyString = "";
//        char[] c = str.toCharArray();
//        for(int i = c.length-1; i >= 0; i--){
//            emptyString = emptyString+c[i];
//        }
//        System.out.println("Reverse String :: " + emptyString);
//    }

   public static String reverseString(String str){
       String res = "";
       for(int i=0; i<str.length(); i++){
           res = str.charAt(i) + res;
       }
       return  res;
   }

    public static void main(String[] args) {
        String str = "KAMLESH";
        String reverseString = ReverseStringTest.reverseString(str);
        System.out.println(reverseString);
    }
}
