package leetcode.editor.cn;

import java.util.Arrays;

public class P2779_MaximumBeautyOfAnArrayAfterApplyingOperation {
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maximumBeauty(int[] nums, int k) {
        Arrays.sort(nums);
        int l = 0, r = 1;
        int res = 1;
        while (r < nums.length) {
            while (nums[r] - k > nums[l] + k) {
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