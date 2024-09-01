package leetcode.editor.cn;

public class P209_MinimumSizeSubarraySum {
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int len = nums.length;
        int l = 0, r = 0;
        int sum = 0;
        int res = len + 1;
        while (r < nums.length) {
            sum += nums[r];
            while (sum >= target) {
                res = Math.min(res, r - l + 1);
                sum -= nums[l ++];
            }
            r ++;
        }
        return res > len ? 0 : res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}