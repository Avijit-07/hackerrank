package co.uk.hackerrank.java;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if(!numMap.containsKey(target - nums[i])) {
                numMap.put(nums[i], i);
            } else {
                result[0] = numMap.get(target - nums[i]);
                result[1] = i;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{4,5,6};
        TwoSum.twoSum(nums, 10);
    }
}

/*
nums = [3,4,5,6], target = 9
        i
         j
 */
