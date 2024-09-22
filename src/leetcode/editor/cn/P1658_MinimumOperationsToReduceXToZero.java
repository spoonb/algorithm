package leetcode.editor.cn;

import java.util.Arrays;

public class P1658_MinimumOperationsToReduceXToZero {
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int minOperations(int[] nums, int x) {
        int sum = Arrays.stream(nums).sum();
        if (sum < x) return -1;
        int l = 0, r = 0;
        int res = Integer.MAX_VALUE, win = 0;
        while (r < nums.length) {
            win += nums[r];
            while (win > sum - x) {
                win -= nums[l];
                l ++;
            }
            if (win == sum - x)
                res = Math.min(res, nums.length - (r - l + 1));
            r ++;
        }
        return res == Integer.MAX_VALUE ? -1 : res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}