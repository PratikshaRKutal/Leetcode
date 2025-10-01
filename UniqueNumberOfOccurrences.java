package solutions;

import java.util.*;

public class UniqueNumberOfOccurrences {
    public static boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> freq = new HashMap<>();
        for(int num:arr){
            freq.put(num, freq.getOrDefault(num,0)+1);
        }

        Set<Integer> set = new HashSet<>(freq.values());
        return set.size() == freq.size();
    }

    public static void main(String[] args) {
        int[] arr={1,2};

        System.out.println(uniqueOccurrences(arr));
    }
}
