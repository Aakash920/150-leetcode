class Solution {
    public int climbStairs(int n) {
        // int[] dp=new int[n+1];
        // return solve(n,dp);
        // int[] dp=new int[n+1];
        // dp[0]=1;
        // dp[1]=1;
        // for(int i=2 ; i<dp.length ; i++){
        //     dp[i]=dp[i-1]+dp[i-2];
        // }
        // return dp[n];
        int prev1=1, prev2=1;
        for(int i=2 ; i<=n ; i++){
            int temp=prev1+prev2;
            prev1=prev2;
            prev2=temp;
        }
        return prev2;
        
    }
    // public int solve(int n, int[] dp){
    //     if(n==0) return 1;
    //     if(n<0) return 0;
    //     if(dp[n]!=0) return dp[n];
    //     return dp[n]=solve(n-1,dp)+solve(n-2,dp);
    // }
}