package leetcode.editor.cn;

import java.util.PriorityQueue;
import java.util.Queue;

public class P2762_ContinuousSubarrays {
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public long continuousSubarrays(int[] nums) {
        int l = 0, r = 0;
        long res = 0;
        Queue<Integer> min = new PriorityQueue<>((o1, o2) -> o1 - o2);
        Queue<Integer> max = new PriorityQueue<>((o1, o2) -> o2 - o1);
        while (r < nums.length) {
            min.add(nums[r]);
            max.add(nums[r]);
            while (Math.abs(min.peek() - nums[r]) > 2 || Math.abs(max.peek() - nums[r]) > 2) {
                min.remove(nums[l]);
                max.remove(nums[l]);
                l ++;
            }
            res += r - l + 1;
            r ++;
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}