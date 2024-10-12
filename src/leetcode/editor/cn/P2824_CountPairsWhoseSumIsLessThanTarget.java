package leetcode.editor.cn;

import java.util.Comparator;
import java.util.List;

public class P2824_CountPairsWhoseSumIsLessThanTarget {
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int countPairs(List<Integer> nums, int target) {
        nums.sort(Comparator.naturalOrder());
        int cnt = 0;
        int l = 0, r = nums.size() - 1;
        while (l < r) {
            if (nums.get(l) + nums.get(r) < target) {
                cnt += r - l;
                l ++;
            } else {
                r --;
            }
        }
        return cnt;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}