package leetcode.editor.cn;

import java.util.Arrays;

public class P719_FindKThSmallestPairDistance {

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int smallestDistancePair(int[] nums, int k) {
        Arrays.sort(nums);
        int l = 0, r = nums[nums.length - 1] - nums[0];
        while (l < r) {
            int mid = l + r >> 1;
            if (cnt(nums, mid) >= k)
                r = mid;
            else
                l = mid + 1;
        }
        return l;
    }

    private int cnt(int[] nums, int mid) {
        int count = 0;
        int l = 0, r = 0;
        while (r < nums.length) {
            while (nums[r] - nums[l] > mid)
                l ++;
            count += r - l;
            r ++;
        }
        return count;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}