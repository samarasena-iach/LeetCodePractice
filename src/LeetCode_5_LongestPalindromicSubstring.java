

public class LeetCode_5_LongestPalindromicSubstring {
    public static String longestPalindrome(String s) {
        StringBuffer sb = new StringBuffer();
        int n = s.length();
        int maxLength = 1, start = 0;

        if (n < 2){
            return s;
        }

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int flag = 1;

                for (int k = 0; k < (j - i + 1) / 2; k++) {
                    if (s.charAt(i + k) != s.charAt(j - k)) {
                        flag = 0;
                    }
                }

                if (flag != 0 && (j - i + 1) > maxLength) {
                    start = i;
                    maxLength = j - i + 1;
                }
            }
        }

        for (int i = start; i <= (start + maxLength - 1); ++i) {
            sb.append(s.charAt(i));
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "forgeeksskeegfor";
        System.out.println(longestPalindrome(str));
    }

}
