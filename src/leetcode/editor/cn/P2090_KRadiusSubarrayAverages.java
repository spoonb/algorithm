package leetcode.editor.cn;

public class P2090_KRadiusSubarrayAverages {
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] getAverages(int[] nums, int k) {
        int len = nums.length;
        long sum = 0;
        int[] res = new int[len];
        for (int i = 0; i < len; i ++)
            res[i] = -1;
        for (int i = 0; i < Math.min(len - 1, 2 * k); i ++)
            sum += nums[i];
        for (int i = k; i < len - k; i ++) {
            sum += nums[i + k];
            res[i] = (int) (sum / (2 * k + 1));
            sum -= nums[i - k];
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}