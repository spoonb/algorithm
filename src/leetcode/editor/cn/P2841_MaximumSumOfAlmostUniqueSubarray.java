package leetcode.editor.cn;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P2841_MaximumSumOfAlmostUniqueSubarray {
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public long maxSum(List<Integer> nums, int m, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        long sum = 0;
        for (int i = 0; i < k - 1; i ++) {
            sum += nums.get(i);
            map.put(nums.get(i), map.getOrDefault(nums.get(i), 0) + 1);
        }
        long res = 0;
        for (int i = k - 1; i < nums.size(); i ++) {
            int r = nums.get(i), l = nums.get(i - k + 1);
            sum += r;
            map.put(r, map.getOrDefault(r, 0) + 1);
            if (map.size() >= m)
                res = Math.max(res, sum);
            sum -= l;
            map.put(l, map.getOrDefault(l, 0) - 1);
            if (map.get(l) == 0)
                map.remove(l);
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}