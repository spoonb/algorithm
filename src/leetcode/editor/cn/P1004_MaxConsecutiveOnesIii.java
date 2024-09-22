package leetcode.editor.cn;

public class P1004_MaxConsecutiveOnesIii {
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int longestOnes(int[] nums, int k) {
        int l = 0, r = 0;
        int res = 0;
        while (r < nums.length) {
            if (nums[r] == 0) k --;
            while (k < 0) {
                if (nums[l] == 0)
                    k ++;
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