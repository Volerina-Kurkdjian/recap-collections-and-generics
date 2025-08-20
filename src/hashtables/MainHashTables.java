package hashtables;

public class MainHashTables {
    public static void main(String[] args) {

        int[] nums = {3,2,4};
        TwoSum twoSum=new TwoSum();
        twoSum.twoSum(nums,6);


        LongestSubstringWithoutRepeatingCharacters solution = new LongestSubstringWithoutRepeatingCharacters();
        // Test 1: Basic case with repeating characters
        String s1 = "abcabcbb";
        System.out.println("Input: \"" + s1 + "\"");
        System.out.println("Expected: 3, Actual: " + solution.lengthOfLongestSubstring(s1));
        System.out.println("-----------------------------------");
    }
}
