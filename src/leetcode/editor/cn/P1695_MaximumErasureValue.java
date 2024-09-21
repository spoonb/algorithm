package leetcode.editor.cn;

import java.util.HashSet;
import java.util.Set;

public class P1695_MaximumErasureValue {
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int l = 0, r = 0;
        int res = 0, sum = 0;
        Set<Integer> set = new HashSet<>();
        while (r < nums.length) {
            while (set.contains(nums[r])) {
                sum -= nums[l];
                set.remove(nums[l]);
                l ++;
            }
            sum += nums[r];
            set.add(nums[r]);
            res = Math.max(res, sum);
            r ++;
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}