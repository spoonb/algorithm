package leetcode.editor.cn;

public class P1493_LongestSubarrayOf1sAfterDeletingOneElement {
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int longestSubarray(int[] nums) {
        int l = 0, r = 0;
        int res = 0, cnt = 1;
        while (r < nums.length) {
            if (nums[r] == 0)
                cnt --;
            while (cnt < 0) {
                if (nums[l] == 0)
                    cnt ++;
                l ++;
            }
            res = Math.max(res, r - l);
            r ++;
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}