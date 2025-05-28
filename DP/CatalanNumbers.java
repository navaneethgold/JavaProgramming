package DP;

import java.util.Arrays;

public class CatalanNumbers {
    public static int catalan(int n,int[] dp){
        if(n==0 || n==1){
            return 1;
        }
        if(dp[n]!=-1){
            return dp[n];
        }else{
            dp[n]=0;
            for(int i=n-1;i>=0;i--){
                dp[n]+=catalan(i,dp)*catalan(n-1-i, dp);
            }
            return dp[n];
        }

    }
    public static int catalanTab(int n){
        int[] dp=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=0;
            for(int j=i-1;j>=0;j--){
                dp[i]+=dp[j]*dp[i-1-j];
            }
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n=10;
        int[] dp=new int[n+1];
        Arrays.fill(dp, -1);
        int value=catalan(n, dp);
        System.out.println(value);

        int value2=catalanTab(n);
        System.out.println(value2);
    }
}
