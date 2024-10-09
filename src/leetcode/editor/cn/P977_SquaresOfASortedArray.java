package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class P977_SquaresOfASortedArray {

// 不需要对结果反转
class Solution {
    public int[] sortedSquares(int[] nums) {
        int l = 0, r = nums.length - 1;
        int[] res = new int[nums.length];
        int i = nums.length - 1;
        while (l <= r) {
            if (Math.abs(nums[l]) >= Math.abs(nums[r])) {
                res[i] = nums[l] * nums[l];
                l ++;
            } else {
                res[i] = nums[r] * nums[r];
                r --;
            }
            i --;
        }
        return res;
    }
}

//leetcode submit region begin(Prohibit modification and deletion)
class Solution_01 {
    public int[] sortedSquares(int[] nums) {
        int l = 0, r = nums.length - 1;
        List<Integer> res = new ArrayList<>();
        int i = 0;
        while (l <= r) {
            if (Math.abs(nums[l]) >= Math.abs(nums[r])) {
                res.add(nums[l] * nums[l]);
                l ++;
            } else {
                res.add(nums[r] * nums[r]);
                r --;
            }
            i ++;
        }
        Collections.reverse(res);
        return res.stream().mapToInt(Integer::intValue).toArray();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}