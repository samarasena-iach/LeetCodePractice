
/**
 * LEETCODE - 392 - Is Subsequence
 * <p>
 * Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
 * <p>
 * A subsequence of a string is a new string that is formed from the original string by
 * deleting some (can be none) of the characters without disturbing the relative positions of the
 * remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
 * <p>
 * Example 01
 * Input: s = "abc", t = "ahbgdc"
 * Output: true
 * <p>
 * Example 02
 * Input: s = "axc", t = "ahbgdc"
 * Output: false
 * <p>
 * Constraints:
 * 0 <= s.length <= 100
 * 0 <= t.length <= 104
 * s and t consist only of lowercase English letters.
 **/
public class LeetCode_0392_Is_Subsequence {
    public static boolean isSubsequence(String s, String t) {
        int preIndex = -1;
        for(int i = 0; i < s.length(); i++){
            Character ch = s.charAt(i);
            t = t.substring(preIndex+1);
            int index = t.indexOf(ch);
            if(index == -1){
                return false;
            }
            preIndex = index;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isSubsequence("abc", "ahbgdc"));
    }
}
