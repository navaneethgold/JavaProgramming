package DP;

import java.util.Arrays;

public class MatricChainMultiplication {
    public static int mcm(int[] arr,int i,int j){
        if(i>=j){
            return 0;
        }
        int minCost=Integer.MAX_VALUE;
        for(int k=i;k<j;k++){
            int leftCost=mcm(arr, i, k);
            int rightCost=mcm(arr, k+1, j);
            int costMultiply=arr[i-1]*arr[k]*arr[j]; // as matrix Mi has dimension arr[i-1] x arr[i]
            int totalCost=leftCost+rightCost+costMultiply;
            minCost=Math.min(minCost, totalCost);
        }
        return minCost;
    }

    public static int mcmMemo(int[] arr,int i,int j,int[][] dp){
        if(i>=j){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int minCost=Integer.MAX_VALUE;
        for(int k=i;k<j;k++){
            int leftCost=mcmMemo(arr, i, k,dp);
            int rightCost=mcmMemo(arr, k+1, j,dp);
            int costMultiply=arr[i-1]*arr[k]*arr[j]; // as matrix Mi has dimension arr[i-1] x arr[i]
            int totalCost=leftCost+rightCost+costMultiply;
            minCost=Math.min(minCost, totalCost);
        }
        dp[i][j]=minCost;
        return minCost;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 30};
        int n = arr.length;

        int result = mcm(arr, 1, n - 1);  // Start from index 1 to n-1
        System.out.println("Minimum number of multiplications: " + result);

        int[][] dp=new int[n+1][n+1];
        for(int[] row:dp){
            Arrays.fill(row, -1);
        }
        int result2 = mcmMemo(arr, 1, n - 1,dp);  // Start from index 1 to n-1
        System.out.println("Minimum number of multiplications: " + result2);

    }
}
