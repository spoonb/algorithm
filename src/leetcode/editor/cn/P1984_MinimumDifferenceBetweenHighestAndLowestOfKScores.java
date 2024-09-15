package leetcode.editor.cn;

import java.util.Arrays;

public class P1984_MinimumDifferenceBetweenHighestAndLowestOfKScores {
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int minimumDifference(int[] nums, int k) {
        if (k == 1) return 0;
        Arrays.sort(nums);
        int res = Integer.MAX_VALUE;
        for (int i = k - 1; i < nums.length; i ++) {
            res = Math.min(res, nums[i] - nums[i - k + 1]);
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}