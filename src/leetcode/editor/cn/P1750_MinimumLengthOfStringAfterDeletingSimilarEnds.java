package leetcode.editor.cn;

public class P1750_MinimumLengthOfStringAfterDeletingSimilarEnds {
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int minimumLength(String s) {
        int len = s.length();
        int l = 0, r = len - 1;
        while (l < r) {
            int i = l, j = r;
            while (i < j && s.charAt(i) == s.charAt(i + 1))
                i ++;
            while (j > i && s.charAt(j) == s.charAt(j - 1))
                j --;
            if (s.charAt(i) != s.charAt(j))
                break;
            l = i + 1;
            r = j - 1;
        }
        if (l > r) return 0;
        return r - l + 1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}