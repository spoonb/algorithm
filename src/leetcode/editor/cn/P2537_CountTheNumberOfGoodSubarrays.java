package leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;

public class P2537_CountTheNumberOfGoodSubarrays {
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public long countGood(int[] nums, int k) {
        int l = 0, r = 0;
        long res = 0, total = 0;
        Map<Integer, Integer> map = new HashMap<>();
        while (r < nums.length) {
            Integer ir = map.getOrDefault(nums[r], 0);
            total += ir;
            map.put(nums[r], ir + 1);
            while (total >= k) {
                map.compute(nums[l], (key, value) -> {
                    if (value == null) return 0;
                    return value - 1;
                });
                total -= map.get(nums[l]);
                res += nums.length - r;
                l ++;
            }
            r ++;
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}