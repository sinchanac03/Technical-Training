package DynamicProgramming.Tabulation;

public class Tabulation {
    public static void main(String[] args) {
        int n = 100;

        // step 1
        int[] dp = new int[n+1];

        // step 2 base cases
        dp[0] = 0;
        if(n >= 1){
            dp[1] = 1;
        }

        // step 3
        for(int i=2; i<=n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }

        // step 4 printing
        System.out.println("Fibonacci Series: ");
        for(int i=0; i<=n; i++){
            System.out.print(dp[i] + " ");
        }
        System.out.println();
    }
}