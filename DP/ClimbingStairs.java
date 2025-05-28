package DP;

import java.util.Arrays;

public class ClimbingStairs {
    public static int climbWithoutMem(int n){
        if(n==0 || n==1){
            return 1;
        }else if(n<0){
            return 0;
        }
        return climbWithoutMem(n-1)+climbWithoutMem(n-2);

    }
    public static int climbMem(int n,int[] dp){
        if(n==0 || n==1){
            return 1;
        }else if(n<0){
            return 0;
        }
        if(dp[n]!=-1) return dp[n];
        else{
            dp[n]= climbMem(n-1,dp)+climbMem(n-2,dp);
        }
        return dp[n];
    }

    public static int climbTabu(int n){
        int[] dp=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int n=10;
        int ways=climbWithoutMem(n);
        System.out.println(ways);

        int[] dp=new int[n+1];
        Arrays.fill(dp, -1);
        int ways2=climbMem(n, dp);
        System.out.println(ways2);

        int ways3=climbTabu(n);
        System.out.println(ways3);


    }
}
