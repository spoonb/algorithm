package leetcode.editor.cn;

public class P392_IsSubsequence {
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j))
                i ++;
            j ++;
        }
        return i >= s.length();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}