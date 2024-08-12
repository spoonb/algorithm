package leetcode.editor.cn;

public class P1283_FindTheSmallestDivisorGivenAThreshold {
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int l = 1, r = 0;
        for (int num : nums) {
            int i = r = Math.max(r, num);
        }
        while (l < r) {
            int mid = l + r >> 1;
            if (sum(nums, mid) <= threshold)
                r = mid;
            else
                l = mid + 1;
        }
        return l;
    }

    private int sum(int[] nums, int mid) {
        int value = 0;
        for (int num : nums) {
            value += (num - 1) / mid + 1;
        }
        return value;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}