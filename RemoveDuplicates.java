package hackerrank;


/**
 Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once.
 The relative order of the elements should be kept the same. Then return the number of unique elements in nums.

 Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:

 Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially.
 The remaining elements of nums are not important as well as the size of nums.

 Return k.

 <a href="   https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/?envType=problem-list-v2&envId=array">26. Remove Duplicates from Sorted Array</a>
 */


public class RemoveDuplicates {

    public int removeDuplicates(int[] nums) {
        if(nums.length == 0)
            return 0;

        int nonDupsLength = 0;

        int[] copyOfNums = new int[nums.length];

        for (int i = 0; i < (nums.length - 1); i++) {
            if (i == 0) {
                nonDupsLength++;
                copyOfNums[0] = nums[0];
                continue;
            }

            if(nums[i] < nums[i+1]) {
                copyOfNums[nonDupsLength] = nums[i+1];
                nonDupsLength++;
            }
        }

        nums = new int[nonDupsLength];

        for (int i = 0; i < nonDupsLength; i++) {
            nums[i] = copyOfNums[i];
        }

        return nonDupsLength;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0,0,1,1,1,2,2,3,3,4};
        System.out.println(new RemoveDuplicates().removeDuplicates(nums));

        nums = new int[]{1, 1, 2};
        System.out.println(new RemoveDuplicates().removeDuplicates(nums));

    }
}


