package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets2 {

    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int start = 0;
        Arrays.sort(nums);
        backtrack(result, new ArrayList<>(), nums, start);

        return result;
    }


    public static void backtrack(List<List<Integer>> result, List<Integer> temp, int[] nums, int index) {
        if(result.contains(temp)){
            return;
        }
        result.add(new ArrayList<>(temp));

        for (int i = index; i < nums.length; i++) {
            temp.add(nums[i]);
            backtrack(result, temp, nums, i+1);
            temp.remove(temp.size() - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(subsetsWithDup(new int[]{1,2,2}));
    }

}
