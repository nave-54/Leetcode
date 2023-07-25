/* Given a string s, find the length of the longest 
substring
 without repeating characters.

 

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.*/


//SOLUTIONS

class Solution {
    public int lengthOfLongestSubstring(String s) {
       Map<Character,Integer> ap=new HashMap<>();
       int start =0,len=0;
       for(int i=0;i<s.length();i++){
           char c=s.charAt(i);
           if(ap.containsKey(c)){
               if(start<=ap.get(c)){
                   start=ap.get(c)+1;
               }
           }
           len=Math.max(len,i-start+1);
           ap.put(c,i);
       }
       return len;
    }
}