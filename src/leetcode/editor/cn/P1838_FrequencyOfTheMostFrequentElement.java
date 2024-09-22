package leetcode.editor.cn;

import java.util.Arrays;

public class P1838_FrequencyOfTheMostFrequentElement {
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int l = 0, r = 1, res = 1;
        long sum = 0;
        while (r < nums.length) {
            sum += (nums[r] - nums[r - 1]) * (long) (r - l);
            while (sum > k) {
                sum -= nums[r] - nums[l];
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