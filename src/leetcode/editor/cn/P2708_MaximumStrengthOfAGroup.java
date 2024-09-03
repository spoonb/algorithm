package leetcode.editor.cn;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class P2708_MaximumStrengthOfAGroup {
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public long maxStrength(int[] nums) {
        if (nums.length == 1) return nums[0];
        List<Integer> list = Arrays.stream(nums).boxed().sorted((t1, t2) -> {
            if (t1 == 0) {
                return -1;
            } else if (t2 == 0) {
                return 1;
            } else if (t1 < 0 && t2 < 0) {
                return Math.abs(t1) - Math.abs(t2);
            } else if (t1 < 0 || t2 < 0) {
                return t1 - t2;
            } else {
                return t1 - t2;
            }
        }).collect(Collectors.toList());
        long sum = 1;
        int zero = 0;
        for (Integer i : list) {
            if (i == 0) {
                zero ++;
                continue;
            }
            sum *= i;
        }
        long res = sum;
        for (int i = 0; i < list.size() - 1; i ++) {
            if (list.get(i) == 0) continue;
            sum /= list.get(i);
            res = Math.max(res, sum);
        }
        if (zero == 0) return res;
        if (zero == list.size()) return 0;
        return res > 0 ? res : 0;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}