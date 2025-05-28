package DP;

import java.util.Arrays;

public class lcs {
    public static int longestCommonSubsequence(String str1,String str2,int ind1,int ind2,int[][] dp){
        if(ind1>=str1.length() || ind2>=str2.length()){
            dp[ind1][ind2]=0;
            return 0;
        }
        if(dp[ind1][ind2]!=-1){
            return dp[ind1][ind2];
        }
        if(str1.charAt(ind1)==str2.charAt(ind2)){
            dp[ind1][ind2]=longestCommonSubsequence(str1, str2, ind1+1, ind2+1,dp)+1;
            return dp[ind1][ind2];
        }else{
            int a=longestCommonSubsequence(str1, str2, ind1+1, ind2,dp);
            int b=longestCommonSubsequence(str1, str2, ind1, ind2+1,dp);
            return dp[ind1][ind2]=Math.max(a,b);
        }
    }

    public static int lcsTab(String str1,String str2){
        int[][] dp=new int[str1.length()+1][str2.length()+1];
        for(int i=1;i<=str1.length();i++){
            for(int j=1;j<=str2.length();j++){
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    // Characters match: include in LCS
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    // Characters don't match: take the max from top or left
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[str1.length()][str2.length()];
    }


    public static void main(String[] args) {
        String str1="pmjghexybyrgzczy";
        String str2="hafcdqbgncrcbihkd";
        int[][] dp=new int[str1.length()+1][str2.length()+1];
        for(int[] row:dp){
            Arrays.fill(row, -1);
        }
        int lcsval=longestCommonSubsequence(str1, str2, 0, 0,dp);
        System.out.println(lcsval);

        int lcsval2=lcsTab(str1, str2);
        System.out.println(lcsval2);
    }
}
