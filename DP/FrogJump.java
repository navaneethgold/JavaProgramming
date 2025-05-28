package DP;

import java.util.Arrays;

public class FrogJump {
    public static int minEnergy(int[] heights,int n){
        if(n<0){
            return 0;
        }
        int single=(n-1<0 ? 0:Math.abs(heights[n]-heights[n-1]))+minEnergy(heights, n-1);
        int doubles=(n-2<0 ? 0:Math.abs(heights[n]-heights[n-2]))+minEnergy(heights, n-2);
        return Math.min(single, doubles);
    }
    public static int minEnergyMemo(int[] heights,int n,int[] dp){
        if(n<0){
            return 0;
        }
        if(dp[n]!=-1) return dp[n];
        int single=(n-1<0 ? 0:Math.abs(heights[n]-heights[n-1]))+minEnergyMemo(heights, n-1,dp);
        int doubles=(n-2<0 ? 0:Math.abs(heights[n]-heights[n-2]))+minEnergyMemo(heights, n-2,dp);
        return dp[n]=Math.min(single, doubles);
    }
    public static void main(String[] args) {
        int[] heights={2,1,3,5,4};
        System.out.println(minEnergy(heights, heights.length-1));

        int[] dp=new int[heights.length+1];
        Arrays.fill(dp, -1);
        System.out.println(minEnergyMemo(heights, heights.length-1,dp));
    }
}
