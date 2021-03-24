package com.company;

public class solution4 {
    public String longestPalindrome(String s) {
        String maxStr="";
        int maxLen=0;
        String odd="";
        String even="";
        for (int i = 0; i < s.length(); i++) {
            odd = findBackTextOdd(s, i);
            if (odd.length()>maxLen){
                maxStr=odd;
                maxLen=odd.length();
            }
            if ((i+1)<s.length()&&s.charAt(i)==s.charAt(i+1)){
                even= findBackTextEven(s,i);
            }
            if (even.length()>maxLen){
                maxStr=even;
                maxLen=even.length();
            }
        }



        return maxStr;
    }

    public String findBackTextOdd(String s,int i) {
        int left=0,right=0;
        left=i-1;
        right=i+1;
        String result;

        while (left>=0&&right<s.length()){
            if (s.charAt(left)==s.charAt(right)){
                right++;
                left--;
            }else {
                break;
            }
        }
        result=s.substring(left+1,right);

        return result;
    }
    public String findBackTextEven(String s,int i) {
        int left=0,right=0;
        left=i-1;
        right=i+2;
        String result;

        while (left>=0&&right<s.length()){
            if (s.charAt(left)==s.charAt(right)){
                right++;
                left--;
            }else {
                break;
            }
        }
        result=s.substring(left+1,right);

        return result;
    }





}
