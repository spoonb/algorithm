package leetcode.editor.cn;

public class P581_ShortestUnsortedContinuousSubarray {
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        int l = -1, r = -1;
        for (int i = 0; i < nums.length; i ++) {
            if (nums[i] < max) {
                r = i;
            } else {
                /*
                    max是n-1时, r正好迭代到n-2
                    反之, r迭代到n-1
                    min同理
                 */
                max = nums[i];
            }
            if (nums[nums.length - 1 - i] > min) {
                l = nums.length - 1 - i;
            } else {
                min = nums[nums.length - 1 - i];
            }
        }
        return r == -1 ? 0 : r - l + 1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}