import java.util.*;
import java.util.stream.Collectors;

public class Solution {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0 || m == 0) {
            return;
        }
        int j = 0;
        for (int i = 0; i < nums2.length; i++) {
            if (nums1[i] > nums2[j]) {

            }
            nums1[m + i] = nums2[i];
        }

    }

    public int product(List<Integer> arr) {
        int max = 0;
        int lastMax = 0;
        if (arr.isEmpty()) {
            return 0;
        }
        List<Integer> q = arr.stream().sorted().collect(Collectors.toList());
        max = q.get(arr.size() - 1);
        lastMax = q.get(arr.size() - 2);
//        for (int i : arr) {
//            if (i>=max){
//                lastMax=max;
//                max=i;
//            }
//        }
        return max * lastMax;
        // великолепный код тут
    }

    public int common(List<Integer> arr) {
//        int thisLen=0;
//        int thisElement=0;
//        int res=0;
//        int maxLen=0;
//
//        List<Integer> arr1 = arr.stream().sorted().collect(Collectors.toList());
//        thisElement= arr.get(0);
//        for (int i : arr1){
//            if (i==thisElement){
//                thisLen++;
//            }
//            if (i!=thisElement){
//                if (thisLen>=maxLen){
//                    res=thisElement;
//                    maxLen=thisLen;
//                }
//                thisElement=i;
//                thisLen=1;
//            }
//        }
//        return res;

        HashMap<Integer, Integer> map = new HashMap<>();
        int len = 0;
        int element = -1;
        for (Integer integer : arr) {
            if (!map.containsKey(integer)) {
                map.put(integer, 1);
            }
            int temp = map.get(integer);
            temp++;
            map.put(integer, temp);

        }
        for (Map.Entry entry : map.entrySet()) {
            if (len < (int) entry.getValue()) {
                len = (int) entry.getValue();
                element = (int) entry.getKey();
            }
        }
        return element;
    }

    public String reverse(String a) {
        String[] arr = a.split(" ");
        if (arr.length < 1) {
            return a;
        }
        StringBuilder res = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i--) {
            res.append(arr[i]).append(" ");
        }
        return res.toString().trim();
        // великолепный код тут
    }

    public String fibonacci(int start, int end) {
        List<Integer> list = new LinkedList(Arrays.asList(0, 1));
        StringBuilder res = new StringBuilder();
//        for (int i = 2; i < end; i++) {
        while (list.size()<end){
            list.add(list.get(list.size() - 2) + list.get(list.size()- 1));
        }
        for (int i = start  ; i < end; i++) {
            res.append(list.get(i)).append(" ");
        }

        return res.toString().trim();
       // великолепный код тут
    }

}
