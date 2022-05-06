package kk.it;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DriverClass {
    public static int[] twoSum(int[] nums, int target) {
        int sum=nums[0]+nums[1];
        System.out.println("SUM OF TWO NUMBER :: "+sum);
        return nums;
    }
    public static void main(String[] args) {
        System.out.println(2+3+"JAVA"+4+3);

        String str = new String("java");
        Thread t=new Thread();
        String str1="java";
       // System.out.println(t == str);
        System.out.println(str == str1);

        int [] arr={1,2};
        int target=3;
        twoSum(arr, target);
       /* List<User> userList=new ArrayList<>();
        User user=new User();
        user.setUserId(101);
        user.setActive(true);
        user.setUserName("kamlesh");
        User user1=new User();
        user1.setUserId(102);
        user1.setActive(true);
        user1.setUserName("akhiesh");
        userList.add(user);
        userList.add(user1);

        Long count=userList.stream().filter(users -> users.getActive()).count();
        System.out.println(" Count Value :::" + count);*/






        HashMap<Integer, String> hm=new HashMap<>();
        hm.put(1, "Kamlesh");
        hm.put(2, "Mahesh");
        hm.put(3, "Ramesh");
      //  Map.entry(HashMap<Integer, String>) entryset










        String string="java";
        char[] ct=string.toCharArray();
        for (int i = 0; i < ct.length; i++) {
            int find = 0;
            for (int j = 0; j <= i; j++) {
                // If any matches found
                if (ct[i] == ct[j])
                    find++;
            }
            if (find == 1)
                System.out.println(
                        "Number of Occurrence of "
                                + ct[i]
                                + " is:" + find);
        }
    }
}
