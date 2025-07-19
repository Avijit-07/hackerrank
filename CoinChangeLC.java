package hackerrank;

public class CoinChangeLC {
    
    public static int coinChange( int n, int[] coins, int[] dp) {
        
        if(n == 0) return 0;

        int ans = Integer.MAX_VALUE;

        for(int i = 0; i<coins.length; i++) {
            if(n-coins[i] >= 0) {
                int subAns = 0;
                if(dp[n-coins[i]] != -1) {
                    subAns = dp[n-coins[i]];
                } else {
                    subAns = coinChange(n-coins[i], coins, dp);
                }
                if(subAns != Integer.MAX_VALUE &&
                        subAns + 1 < ans) {
                    ans = subAns + 1;
                }
            }
        }
        return dp[n] = ans;
    }
}
