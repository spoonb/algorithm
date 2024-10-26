package leetcode.editor.cn;

public class P2460_ApplyOperationsToAnArray {
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] applyOperations(int[] nums) {
        int l = 0, r = 1;
        int[] res = new int[nums.length];
        while (r < nums.length) {
            if (nums[r - 1] == nums[r]) {
                nums[r - 1] *= 2;
                nums[r] = 0;
            }
            if (nums[l] > 0)
                res[l] = nums[l ++];
            r ++;
        }
        if (nums[l] > 0)
            res[l] = nums[l];
        return nums;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}