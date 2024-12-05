package leetcode.editor.cn;

public class P1855_MaximumDistanceBetweenAPairOfValues {
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int res = 0;
        int i = 0, j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (i > j) {
                j ++;
            } else if (nums1[i] <= nums2[j]) {
                res = Math.max(res, j - i);
                j ++;
            } else {
                i ++;
            }
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}