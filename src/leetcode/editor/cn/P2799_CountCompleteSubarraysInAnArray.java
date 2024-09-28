package leetcode.editor.cn;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class P2799_CountCompleteSubarraysInAnArray {
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int countCompleteSubarrays(int[] nums) {
        long cnt = Arrays.stream(nums).distinct().count();
        int l = 0, r = 0, len = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        int res = 0;
        while (r < nums.length) {
            map.merge(nums[r], 1, Integer::sum);
            while (map.size() >= cnt) {
                res += len - r;
                map.put(nums[l], map.get(nums[l]) - 1);
                if (map.get(nums[l]) == 0)
                    map.remove(nums[l]);
                l ++;
            }
            r ++;
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}