package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P15_ThreeSum {
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums.length < 3) return res;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i ++) {
            int l = i + 1, r = nums.length - 1;
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                if (sum > 0)
                    r --;
                else if (sum < 0)
                    l ++;
                else {
                    res.add(List.of(nums[i], nums[l], nums[r]));
                    while (l < r && nums[l] == nums[++l]);
                    while (l < r && nums[r] == nums[--r]);
                }
            }
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}