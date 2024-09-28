package leetcode.editor.cn;

import java.util.Arrays;

public class P2962_CountSubarraysWhereMaxElementAppearsAtLeastKTimes {
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public long countSubarrays(int[] nums, int k) {
        int max = Arrays.stream(nums).max().getAsInt();
        int l = 0, r = 0, maxCnt = 0;
        long res = 0;
        while (r < nums.length) {
            if (nums[r] == max)
                maxCnt ++;
            while (maxCnt >= k) {
                res += nums.length - r;
                if (nums[l] == max)
                    maxCnt --;
                l ++;
            }
            r ++;
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}