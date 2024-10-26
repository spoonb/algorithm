package leetcode.editor.cn;

public class P2540_MinimumCommonValue {
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int i = 0, j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j])
                i ++;
            else if (nums1[i] > nums2[j])
                j ++;
            else
                return nums1[i];
        }
        return -1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}