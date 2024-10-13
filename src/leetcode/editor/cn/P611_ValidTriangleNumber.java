package leetcode.editor.cn;

import java.util.Arrays;

public class P611_ValidTriangleNumber {
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int cnt = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = nums.length - 1; k > j; k --) {
                    if (nums[i] + nums[j] > nums[k]) {
                        cnt += k - j;
                        break;
                    }
                }
            }
        }
        return cnt;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}