package co.uk.hackerrank.java;

import java.util.*;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
//        Map<Integer, Integer> numMap = new HashMap<>();
//        int[] result = new int[2];
//        for (int i = 0; i < nums.length; i++) {
//            if(!numMap.containsKey(target - nums[i])) {
//                numMap.put(nums[i], i);
//            } else {
//                result[0] = numMap.get(target - nums[i]);
//                result[1] = i;
//            }
//        }
//        return result;
        int[] copyArray =  Arrays.copyOf(nums, nums.length);
        Arrays.sort(copyArray);

        int num1 = 0, num2 = 0;
        for(int i = 0, j = copyArray.length - 1; i < copyArray.length - 1;) {
            int sum = copyArray[i] + copyArray[j];
            if(sum == target) {
                num1 = copyArray[i];
                num2 = copyArray[j];
                break;
            } else if (sum < target) {
                i++;
            } else {
                j--;
            }
        }

        Set<Integer> resultSet = new HashSet<>();

        for (int i = 0; i < nums.length; i++){
            if(nums[i] == num1) {
                resultSet.add(i);
            } if(nums[i] == num2) {
                resultSet.add(i);
            }
        }
        return resultSet.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3, 3};
        int[] twoSum = TwoSum.twoSum(nums, 6);
    }
}
