package leetcode.editor.cn;

public class P2730_FindTheLongestSemiRepetitiveSubstring {
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int longestSemiRepetitiveSubstring(String s) {
        int l = 0, r = 1, len = s.length();
        int res = 0, cnt = 1;
        while (r < len) {
            if (s.charAt(r) == s.charAt(l))
                cnt --;
            while (cnt < 0) {
                if (s.charAt(l) == s.charAt(l + 1))
                    cnt ++;
                l ++;
            }
            res = Math.max(res, r - l + 1);
            r ++;
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}