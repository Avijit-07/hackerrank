package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Permutation {

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> resultList = new ArrayList<>();

        backtrack(resultList, new ArrayList<>(), nums);

        return resultList;
    }

    public static void backtrack(List<List<Integer>> resultList, List<Integer> tempList, int[] nums) {

        if(tempList.size() == nums.length) {
            resultList.add(new ArrayList<>(tempList));
        }

        // iterate over all numbers
        for (int num: nums) {
            if(tempList.contains(num))
                continue;
            tempList.add(num); // 1,2
            backtrack(resultList, tempList, nums);

            tempList.remove(tempList.size()-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(permute(new int[]{0,1}));
    }

}
