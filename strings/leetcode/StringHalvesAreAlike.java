package com.strings.leetcode;
// https://leetcode.com/problems/determine-if-string-halves-are-alike/submissions/
class StringHalvesAreAlike {
    public boolean halvesAreAlike(String s) {
        
        
        
        String vowels = "aeiouAEIOU";

        int mid = s.length()/2;
        int a_count = 0;
        int b_count = 0;
        
        for(int i=0 , j=mid ;i<mid; i++,j++){
            char ch = s.charAt(i);
            char ch2 = s.charAt(j);
            if(vowels.indexOf(ch) >= 0){
                a_count += 1;
            }
            if(vowels.indexOf(ch2) >= 0){
                b_count += 1;
            }
        }
        
        return a_count == b_count;
        
        
        
    }
    
   
}