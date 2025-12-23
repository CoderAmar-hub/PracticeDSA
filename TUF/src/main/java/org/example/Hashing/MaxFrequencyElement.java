package org.example.Hashing;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class MaxFrequencyElement {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.maxFrequencyElements(new int[]{1,2,2,3,1,4});
        System.out.println("total frequencies of elements in nums such that those elements all have the maximum frequency is : "+ result);

        result = solution.maxFrequencyElements(new int[]{1,2,3,4,5});
        System.out.println("total frequencies of elements in nums such that those elements all have the maximum frequency is : "+ result);
    }
}

class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int maxVal = map.values().stream().max(Comparator.naturalOrder()).orElse(0);
        int totalCount = 0;

        for(Integer key : map.keySet()){
            if(map.get(key) == maxVal)
                totalCount = totalCount+maxVal;
        }

        return totalCount;
    }
}
