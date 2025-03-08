package leetcode.editor.cn;

public class P2367_NumberOfArithmeticTriplets {
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int res = 0;
        int i = 0, j = 1;
        for (int k : nums) {
            while (nums[j] + diff < k)
                j ++;
            if (nums[j] + diff > k) continue;
            while (nums[i] + diff < nums[j])
                i ++;
            if (nums[i] + diff == nums[j])
                res ++;
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}