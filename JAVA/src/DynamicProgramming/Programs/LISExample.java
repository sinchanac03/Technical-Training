package DynamicProgramming.Programs;

//longest increasing subsequence
public class LISExample {

    public static int longestIncreasingSubsequence(int[] arr) {

        int n = arr.length;

        // Step 1: Create dp array
        int[] dp = new int[n];

        // Step 2: Initialize all values as 1
        for (int i = 0; i < n; i++) {
            dp[i] = 1;
        }

        // Step 3: Build dp array
        for (int i = 1; i < n; i++) {

            // Check all previous elements
            for (int j = 0; j < i; j++) {

                // If increasing condition satisfied
                if (arr[j] < arr[i]) {

                    // Update dp[i]
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        // Step 4: Find maximum in dp array
        int max = 0;

        for (int i = 0; i < n; i++) {
            if (dp[i] > max) {
                max = dp[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {

        int[] arr = {10, 9, 2, 5, 3, 7, 101, 18};

        int result = longestIncreasingSubsequence(arr);

        System.out.println("Length of LIS = " + result);
    }
}