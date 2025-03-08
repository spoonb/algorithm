package leetcode.editor.cn;

public class P2825_MakeStringASubsequenceUsingCyclicIncrements {
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        if (str2.length() > str1.length()) return false;
        int i = 0, j = 0;
        char[] c1s = str1.toCharArray();
        char[] c2s = str2.toCharArray();
        while (i < c1s.length && j < c2s.length) {
            if (c2s[j] == c1s[i] || (c2s[j] - 'a') == ((c1s[i] - 'a' + 1) % 26))
                j ++;
            i ++;
        }
        return j >= c2s.length;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}