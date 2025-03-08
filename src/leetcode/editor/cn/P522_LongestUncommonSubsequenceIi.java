package leetcode.editor.cn;

public class P522_LongestUncommonSubsequenceIi {
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

    private String[] strs;

    public int findLUSlength(String[] strs) {
        this.strs = strs;
        int res = -1;
        for (int i = 0; i < strs.length; i ++) {
            if (subsequence(strs, i, i + 1)) {
                res = Math.max(res, strs[i].length());
            }
        }
        return res;
    }

    private boolean subsequence(String[] strs, int q, int p) {
        p %= strs.length;
        String a = strs[q];
        while (p != q) {
            int i = 0, j = 0;
            String b = strs[p];
            while (i < a.length() && j < b.length()) {
                if (a.charAt(i) == b.charAt(j))
                    i ++;
                j ++;
            }
            if (i >= a.length()) return false;
            p = (p + 1) % strs.length;
        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}