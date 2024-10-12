package leetcode.editor.cn;

import java.util.Arrays;

public class PLCP_28_FourXy4Wx {
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int purchasePlans(int[] nums, int target) {
        Arrays.sort(nums);
        int cnt = 0;
        int l = 0, r = nums.length - 1;
        while (l < r) {
            if (nums[l] + nums[r] <= target) {
                cnt = (cnt + r - l) % 1000000007;
                l ++;
            } else {
                r --;
            }
        }
        return cnt;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}