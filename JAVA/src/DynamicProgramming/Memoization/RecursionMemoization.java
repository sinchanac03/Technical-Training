package DynamicProgramming.Memoization;

import java.util.Arrays;

// Apply Memoization
public class RecursionMemoization {
    static int fib(int x, int[] dp){
        if(x==0 || x==1){  //Base Case
            return x;
        }
        //step 3
        if(dp[x] != -1){
            return dp[x];
        }
        //step 2
        dp[x] = fib(x-1, dp) + fib(x-2, dp); // Recursive Case
        return dp[x];
    }

    public static void main(String[] args) {
        int n = 100;
        // step 1
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        for(int i=0; i<n; i++){
            System.out.print(fib(i, dp) + " ");
        }
    }
}