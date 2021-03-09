import java.util.*;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
//        String s = "hello word";
//        System.out.println(solution.reverse(s));
        int[] nums1 = {0,1,2,2,3,0,4,2};
        int m = 2;
        System.out.println(solution.removeElement(nums1,m));
        for (int i : nums1) {
            System.out.println(i);
        }
    }

}
