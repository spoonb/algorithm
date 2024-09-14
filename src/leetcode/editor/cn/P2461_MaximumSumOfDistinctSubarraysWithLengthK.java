package leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;

public class P2461_MaximumSumOfDistinctSubarraysWithLengthK {
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        long sum = 0;
        for (int i = 0; i < k - 1; i ++) {
            sum += nums[i];
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        long res = 0;
        for (int i = k - 1; i < nums.length; i++) {
            sum += nums[i];
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            if (map.size() == k) {
                res = Math.max(res, sum);
            }
            sum -= nums[i - k + 1];
            map.put(nums[i - k + 1], map.getOrDefault(nums[i - k + 1], 0) - 1);
            if (map.get(nums[i - k + 1]) <= 0)
                map.remove(nums[i - k + 1]);
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}