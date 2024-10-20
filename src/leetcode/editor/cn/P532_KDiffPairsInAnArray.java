package leetcode.editor.cn;

import java.util.Arrays;

public class P532_KDiffPairsInAnArray {
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        int l = 0, r = 1;
        int res = 0;
        while (r < nums.length) {
            if (Math.abs(nums[r] - nums[l]) < k) {
                r ++;
            } else if (Math.abs(nums[r] - nums[l]) > k) {
                l ++;
            } else if (l != r) {
                res ++;
                do {
                    r ++;
                } while (r < nums.length && nums[r] == nums[r - 1]);
            } else {
                r ++;
            }
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}