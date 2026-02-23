package leetcode;

public class ContainerWithMostWater {

    public int maxArea(int[] height) {
        int maxArea = 0;
        int len = height.length;
        int left = 0, right = len - 1;

        while (left < right) {
            int area = Math.min(height[left], height[right]) * (right - left);
            maxArea = Math.max(maxArea, area);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }


        }
        return maxArea;

    }
}
