package leetcode.editor.cn;

import java.util.Arrays;

public class P16_ThreeSumClosest {
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int min = 1000000000;
        int res = 0;
        for (int i = 0; i < nums.length - 2; i ++) {
            int l = i + 1, r = nums.length - 1;
            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                if (sum == target)
                    return sum;
                else if (sum < target)
                    l ++;
                else
                    r --;
                int cur = Math.abs(sum - target);
                if (cur < min) {
                    min = cur;
                    res = sum;
                }
            }
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}