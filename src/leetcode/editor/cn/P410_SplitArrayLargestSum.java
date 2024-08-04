package leetcode.editor.cn;

public class P410_SplitArrayLargestSum {

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int splitArray(int[] nums, int k) {
        int l = 0, r = 0;
        for (int i : nums) {
            l = Math.max(l, i);
            r += i;
        }
        while (l < r) {
            int mid = l + r >> 1;
            if (splits(nums, mid) <= k)
                r = mid;
            else
                l = mid + 1;
        }
        return l;
    }

    private int splits(int[] nums, int max) {
        int cnt = 1;
        int curSum = 0;
        for (int i : nums) {
            if ((curSum += i) > max) {
                cnt ++;
                curSum = i;
            }
        }
        return cnt;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}