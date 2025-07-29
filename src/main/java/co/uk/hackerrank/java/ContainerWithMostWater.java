package co.uk.hackerrank.java;

/**
 Container With Most Water
 You are given an integer array heights where heights[i] represents the height of the i-th bar.

 You may choose any two bars to form a container. Return the maximum amount of water a container can store.

 <a href="https://neetcode.io/problems/max-water-container?list=blind75">Container with Most Water</a>
 */
public class ContainerWithMostWater {

    public static int maxArea(int[] heights) {

        int maxArea = 0;
        for (int i = 0, j = (heights.length - 1); i != j;) {

            int area = (j - i) * Math.min(heights[i], heights[j]);
            maxArea = Math.max(maxArea, area);

            if (heights[i] < heights[j]) {
                i++;
            }
            else {
                j--;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        System.out.println(ContainerWithMostWater.maxArea(new int[]{1,7,2,5,4,7,6,3}));
    }
}
