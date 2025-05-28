package DP;

import java.util.Arrays;

public class knapsackRec01 {
    public static int knapsackRec(int[] weights,int[] values,int n, int capacity){ // O(2^n) time complexity
        if(weights.length==0 || values.length==0 || capacity==0 || n==0){
            return 0;
        }
        if(weights[n-1]<capacity){
            int include=values[n-1]+knapsackRec(weights, values, n-1, capacity-weights[n-1]);
            int exclude=knapsackRec(weights, values, n-1, capacity);
            return Math.max(include, exclude);
        }
        return knapsackRec(weights, values, n-1, capacity);
    }


    public static int knapsackTabulation(int[] weights,int[] values,int n , int capacity){
        int[][] dp=new int[weights.length+1][capacity+1];
        for(int i=0;i<=weights.length;i++){
            for(int j=0;j<=capacity;j++){
                if(i==0 || j==0){
                    dp[i][j]=0;
                }else if(weights[i-1]<j){
                    int include=values[i-1]+dp[i-1][j-weights[i-1]];
                    int exclude=dp[i-1][j];
                    dp[i][j]=Math.max(include,exclude);
                }else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[n][capacity];
    }



    public static int knapsackMemo(int[] weights, int[] values,int n, int capacity,int[][] dp){
        if(weights.length==0 || values.length==0 || capacity==0 || n==0){
            return 0;
        }
        if(dp[n][capacity]!=-1){
            return dp[n][capacity];
        }
        if(weights[n-1]<capacity){
            int include=values[n-1]+knapsackMemo(weights, values, n-1, capacity-weights[n-1],dp);
            int exclude=knapsackMemo(weights, values, n-1, capacity,dp);
            dp[n][capacity]= Math.max(include, exclude);
            return Math.max(include, exclude);
        }
        dp[n][capacity] = knapsackMemo(weights, values, n-1, capacity,dp);
        return dp[n][capacity];
    }



    public static void main(String[] args) {
        int[] weights = { 2, 3, 4, 5 };
        int[] values = { 3, 4, 5, 6 };
        int capacity = 5;
        int n = weights.length;

        int maxValue = knapsackRec(weights, values, n, capacity);
        System.out.println("Maximum value in knapsackRec = " + maxValue);
        int[][] dp=new int[n+1][capacity+1];
        for (int[] row : dp)
            Arrays.fill(row, -1);
        int maxValue2 = knapsackMemo(weights, values, n, capacity,dp);
        System.out.println("Maximum value in knapsackRec = " + maxValue2);

        int maxValue3 = knapsackTabulation(weights, values, n, capacity);
        System.out.println("Maximum value in knapsackRec = " + maxValue3);
    }
}
