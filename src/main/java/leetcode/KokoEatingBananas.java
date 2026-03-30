package leetcode;

public class KokoEatingBananas {

    public static int minEatingSpeed(int[] piles, int h) {

        int minSpeed = 1;
        int maxSpeed = Integer.MIN_VALUE;

        for(int pile : piles) {
            maxSpeed = Math.max(maxSpeed, pile);
        }

        while (minSpeed <= maxSpeed) {
            int mid = minSpeed + (maxSpeed - minSpeed) / 2;
            long hour = 0;

            for (int pile : piles) {
                hour += (pile + mid - 1) / mid;
            }
            if(hour <= h) {
                maxSpeed = mid - 1;
            } else {
                minSpeed = mid + 1;
            }
        }
        return minSpeed;
    }

    public static void main(String[] args) {
        System.out.println(minEatingSpeed(new int[]{1,4,3,2}, 9));
    }

}
