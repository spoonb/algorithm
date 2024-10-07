package leetcode.editor.cn;

public class P2401_LongestNiceSubarray {
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int longestNiceSubarray(int[] nums) {
        int l = 0, r = 0;
        int res = 0, total = 0;
        while (r < nums.length) {
            while ((total & nums[r]) != 0) {
                total ^= nums[l];
                l ++;
            }
            total ^= nums[r];
            res = Math.max(res, r - l + 1);
            r ++;
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}