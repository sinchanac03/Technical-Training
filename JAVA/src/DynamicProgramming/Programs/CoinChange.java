package DynammicProgramming.Programs;

public class CoinChange {

    public static int coinChange(int[] coins, int amount) {

        // Step 1: Create DP array
        int[] dp = new int[amount + 1];

        // Step 2: Fill with large value (infinity)
        for (int i = 0; i <= amount; i++) {
            dp[i] = Integer.MAX_VALUE;
        }

        // Base case
        dp[0] = 0;

        // Step 3: Build DP table
        for (int i = 1; i <= amount; i++) {

            // Try every coin
            for (int coin : coins) {

                if (coin <= i && dp[i - coin] != Integer.MAX_VALUE) {

                    // Take minimum
                    dp[i] = Math.min(dp[i], 1 + dp[i - coin]);
                }
            }
        }

        // Step 4: If not possible
        if (dp[amount] == Integer.MAX_VALUE) {
            return -1;
        }

        return dp[amount];
    }

    public static void main(String[] args) {

        int[] coins = {1, 2, 5};
        int amount = 11;

        int result = coinChange(coins, amount);
        System.out.println("Minimum coins required = " + result);
    }
}