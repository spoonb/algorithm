package leetcode.editor.cn;

public class P930_BinarySubarraysWithSum {
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int l1 = 0, l2 = 0, r = 0;
        int sum1 = 0, sum2 = 0;
        int res = 0;
        while (r < nums.length) {
            sum1 += nums[r];
            while (l1 <= r && sum1 > goal) {
                sum1 -= nums[l1 ++];
            }
            sum2 += nums[r];
            while (l2 <= r && sum2 >= goal) {
                sum2 -= nums[l2 ++];
            }
            res += l2 - l1;
            r ++;
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}