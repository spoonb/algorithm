package leetcode.editor.cn;

public class P2302_CountSubarraysWithScoreLessThanK {
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public long countSubarrays(int[] nums, long k) {
        int l = 0, r = 0;
        long res = 0, sum = 0;
        while (r < nums.length) {
            sum += nums[r];
            while (sum * (r - l + 1) >= k) {
                sum -= nums[l ++];
            }
            res += r - l + 1;
            r ++;
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}