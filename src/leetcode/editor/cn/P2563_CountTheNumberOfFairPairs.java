package leetcode.editor.cn;

import java.util.Arrays;

public class P2563_CountTheNumberOfFairPairs {
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        int len = nums.length;
        int j = 0, l = len, r = len;
        long res = 0;
        while (j < len) {
            while (r > 0 && nums[r - 1] > upper - nums[j])
                r --;
            while (l > 0 && nums[l - 1] >= lower - nums[j])
                l --;
            // System.out.printf("%s %s %s\n", l, r, j);
            res += Math.min(r, j) - Math.min(l, j);
            j ++;
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}