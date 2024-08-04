package leetcode.editor.cn;

public class P167_TwoSumIiInputArrayIsSorted {

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        for (int i = 0; i < len - 1; i ++) {
            int l = i + 1, r = len - 1;
            while (l < r) {
                int mid = l + r >> 1;
                if (nums[mid] >= target - nums[i])
                    r = mid;
                else
                    l = mid + 1;
            }
            if (nums[l] == target - nums[i])
                return new int[]{i+1, l+1};
        }
        return new int[]{-1, -1};
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}