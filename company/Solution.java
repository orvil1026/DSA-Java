package com.company;

class Solution {
    public static void main(String[] args) {
        System.out.println(freqAlphabets("10#11#12"));
    }

    static String freqAlphabets(String s) {
        
        String result = "";
        
        for(int i=0; i<s.length(); i++){
            if(String.valueOf(s.charAt(i)).equals("#")){
                    continue;
            }
            if(i<=s.length()-3){
                
                if(String.valueOf(s.charAt(i+2)).equals("#")){
                    String str = s.substring(i,i+2);
                    int n = Integer.parseInt(str);
                    char ch = (char)(n+96);
                    result += ch;
                    i = i+2;
                }else{
                    String str = String.valueOf(s.charAt(i));
                    int n = Integer.parseInt(str);
                    char ch = (char)(n+96);
                    result += ch;
                }
            }else{
                String str = String.valueOf(s.charAt(i));
                    int n = Integer.parseInt(str);
                    char ch = (char)(n+96);
                    result += ch;
            }
        }
        
        return result;
        
    }
}