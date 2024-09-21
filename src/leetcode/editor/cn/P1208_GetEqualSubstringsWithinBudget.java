package leetcode.editor.cn;

public class P1208_GetEqualSubstringsWithinBudget {
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int l = 0, r = 0, len = s.length();
        int res = 0, sum = 0;
        while (r < len) {
            int ir = s.charAt(r) - t.charAt(r);
            sum += Math.abs(ir);
            while (sum > maxCost) {
                int il = s.charAt(l) - t.charAt(l);
                sum -= Math.abs(il);
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