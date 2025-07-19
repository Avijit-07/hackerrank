package hackerrank;

public class ContinuousSubarrayLC {
    public static void main(String[] args) {
        System.out.println(checkSubarraySum(new int[] { 23, 2, 6, 4, 7 }, 6));
    }

    public static boolean checkSubarraySum(int[] array, int k) {
        int currSum = 0;
        for (int i = 0; i < array.length - 1; i++) {
            currSum = array[i];
            for (int j = i + 1; j < array.length; j++) {
                currSum = currSum + array[j];
                if (currSum % k == 0)
                    return true;
            }

        }
        return false;
    }
}
