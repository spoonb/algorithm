package leetcode.editor.cn;

public class P3258_CountSubstringsThatSatisfyKConstraintI {
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int countKConstraintSubstrings(String s, int k) {
        int l = 0, r = 0;
        int[] cnt = new int[2];
        int res = 0;
        while (r < s.length()) {
            int ir = s.charAt(r) - '0';
            cnt[ir] ++;
            while (cnt[0] > k && cnt[1] > k) {
                int il = s.charAt(l) - '0';
                cnt[il] --;
                l ++;
            }
            res += r - l + 1;
            r ++;
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}