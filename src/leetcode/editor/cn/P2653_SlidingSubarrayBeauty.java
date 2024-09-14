package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

public class P2653_SlidingSubarrayBeauty {
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] getSubarrayBeauty(int[] nums, int k, int x) {
        int[] cnt = new int[101];
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < k - 1; i ++)
            cnt[nums[i] + 50] ++;
        for (int i = k - 1; i < nums.length; i ++) {
            cnt[nums[i] + 50] ++;
            res.add(searchK(cnt, x));
            cnt[nums[i - k + 1] + 50] --;
        }
        return res.stream().mapToInt(Integer::intValue).toArray();
    }

    private int searchK(int[] cnt, int x) {
        int count = 0;
        for (int i = 0; i < cnt.length; i ++) {
            count += cnt[i];
            if (count >= x) {
                return Math.min(0, i - 50);
            }
        }
        return Integer.MIN_VALUE;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}