package leetcode.editor.cn;

public class P643_MaximumAverageSubarrayI {
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for (int i = 0; i < k; i ++) {
            sum += nums[i];
        }
        int res = sum;
        for (int i = k; i < nums.length; i ++) {
            sum += nums[i] - nums[i - k];
            res = Math.max(res, sum);
        }
        return (double) res / k;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}