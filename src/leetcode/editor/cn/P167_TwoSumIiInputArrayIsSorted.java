package leetcode.editor.cn;

public class P167_TwoSumIiInputArrayIsSorted {

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        while (l < r) {
            if (nums[l] + nums[r] < target) {
                l ++;
            } else if (nums[l] + nums[r] > target) {
                r --;
            } else {
                return new int[] {l + 1, r + 1};
            }
        }
        return new int[0];
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}