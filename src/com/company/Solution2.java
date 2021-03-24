package com.company;

import java.util.ArrayList;
import java.util.List;

public class Solution2 {

    public int lengthOfLongestSubstring(String s) {
        String temp="";
        int length=0;
        int maxLength=0;
        char c;
        for (int i = 0; i < s.length(); i++) {
            c=s.charAt(i);
            if (temp.contains(String.valueOf(c))){
                maxLength=length>maxLength?length:maxLength;
                length=0;
                i-=temp.length();
                temp="";

                continue;
            }
            temp+=c;
            length++;


        }
        maxLength=length>maxLength?length:maxLength;
        return maxLength;
    }
}
