package leetcode.editor.cn;

import java.util.TreeMap;

public class P1438_LongestContinuousSubarrayWithAbsoluteDiffLessThanOrEqualToLimit {
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int longestSubarray(int[] nums, int limit) {
        int l = 0, r = 0;
        TreeMap<Integer, Integer> map = new TreeMap<>();
        int res = 0;
        while (r < nums.length) {
            map.put(nums[r], map.getOrDefault(nums[r], 0) + 1);
            while (map.lastKey() - map.firstKey() > limit) {
                map.put(nums[l], map.get(nums[l]) - 1);
                if (map.get(nums[l]) == 0) {
                    map.remove(nums[l]);
                }
                l ++;
            }
            res = Math.max(res, r - l + 1);
            r ++;
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}