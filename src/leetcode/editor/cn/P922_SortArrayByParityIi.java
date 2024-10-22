package leetcode.editor.cn;

public class P922_SortArrayByParityIi {
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int i = 0, j = 1;
        while (i < nums.length && j < nums.length) {
            if (nums[i] % 2 == 1 && nums[j] % 2 == 0) {
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
            }
            if (nums[j] % 2 == 1) {
                j += 2;
            }
            if (nums[i] % 2 == 0) {
                i += 2;
            }
        }
        return nums;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}