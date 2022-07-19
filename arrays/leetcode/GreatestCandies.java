package com.arrays.leetcode;

import java.util.ArrayList;
import java.util.List;

// Kids With the Greatest Number of Candies
// https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/

public class GreatestCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        List<Boolean> ans = new ArrayList<>(candies.length);

        int max = 0;

        for(int i: candies){
            max = Math.max(i,max);
        }

        for(int i: candies){
            ans.add(i+extraCandies >= max);
        }



        return ans;

    }
}
