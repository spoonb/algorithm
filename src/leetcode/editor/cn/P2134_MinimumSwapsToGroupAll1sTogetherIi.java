package leetcode.editor.cn;

import java.util.Arrays;

public class P2134_MinimumSwapsToGroupAll1sTogetherIi {
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int minSwaps(int[] nums) {
        int k = Arrays.stream(nums).sum();
        if (k == 0) return 0;
        int sum = 0;
        for (int i = 0; i < k - 1; i ++)
            sum += nums[i];
        int res = Integer.MAX_VALUE, len = nums.length;
        for (int i = 0; i < len; i ++) {
            sum += nums[(i + k - 1) % len];
            res = Math.min(res, k - sum);
            sum -= nums[i];
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}