package hashtables;

import java.util.Arrays;
import java.util.HashSet;


public class LongestSubstringWithoutRepeatingCharacters {
    //Sliding windows + HashSet
//Given a string s, find the length of the longest substring without duplicate characters.
//
//Example 1:
//
//Input: s = "abcabcbb"
//Output: 3
//Explanation: The answer is "abc", with the length of 3.
//Example 2:
//
//Input: s = "bbbbb"
//Output: 1
//Explanation: The answer is "b", with the length of 1.


    public int lengthOfLongestSubstring(String s) {

     char[] array=  s.toCharArray();
     HashSet<Character> hashSet=new HashSet<>();
     int left=0, maxLen=0;

        for(int right=0;right<array.length;right++){

            while(hashSet.contains(array[right])){
                hashSet.remove(array[left]);
                left++;
            }

            hashSet.add(array[right]);
            maxLen=Math.max(maxLen,right-left+1);

        }

        return maxLen;
    }


}
