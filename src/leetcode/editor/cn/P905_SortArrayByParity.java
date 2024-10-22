package leetcode.editor.cn;

public class P905_SortArrayByParity {
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int l = 0, r = 0;
        while (r < nums.length) {
            if (nums[r] % 2 == 0) {
                int tmp = nums[r];
                nums[r] = nums[l];
                nums[l] = tmp;
            }
            if (nums[l] % 2 == 0) {
                l ++;
            }
            r ++;
        }
        return nums;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}