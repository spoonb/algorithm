package leetcode.editor.cn;

public class P713_SubarrayProductLessThanK {
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int l = 0, r = 0;
        int res = 0, total = 1;
        while (r < nums.length) {
            total *= nums[r];
            while (l <= r && total >= k)
                total /= nums[l ++];
            res += r - l + 1;
            r ++;
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}