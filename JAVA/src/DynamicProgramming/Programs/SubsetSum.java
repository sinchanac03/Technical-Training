package DynamicProgramming.Programs;

public class SubsetSum {

    public static boolean subsetSum(int[] arr, int target) {
        int n = arr.length;

        boolean[][] dp = new boolean[n + 1][target + 1];

        // Base case
        for (int i = 0; i <= n; i++) {
            dp[i][0] = true;
        }

        // Fill table
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= target; j++) {

                // Not pick
                dp[i][j] = dp[i - 1][j];

                // Pick
                if (arr[i - 1] <= j) {
                    dp[i][j] = dp[i][j] || dp[i - 1][j - arr[i - 1]];
                }
            }
        }

        return dp[n][target];
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 7, 8, 10};
        int target = 11;

        System.out.println(subsetSum(arr, target)); // true
    }
}