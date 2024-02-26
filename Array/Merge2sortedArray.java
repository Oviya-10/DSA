import java.util.*;
public class Solution {
    public static List< Integer > sortedArray(int []a, int []b) {
        List<Integer> list = new ArrayList<Integer>();
        Set<Integer> set = new TreeSet<>();
        for(int i =0;i<a.length;i++){
            set.add(a[i]);
        }
        for(int i=0;i<b.length;i++){
            set.add(b[i]);
        }
        list.addAll(set);
        return list;
    }
}
