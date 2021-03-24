package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class solution3 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double result;
        List<Integer> list=new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            list.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            list.add(nums2[i]);
        }
        Collections.sort(list);
        int index=0;
        index= list.size()/2;
         if (list.size()%2==0){

             result=(list.get(index)+list.get(index-1))/2.0;
         }
         else {
             result=list.get(index);
         }

        return result;
    }
}
