package leetcode.editor.cn;

import java.util.Arrays;

public class P3132_FindTheIntegerAddedToArrayIi {
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int minimumAddedInteger(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        for (int k = 2; k >= 0; k --) {
            int diff = nums2[0] - nums1[k];
            int i = k, j = 0;
            while (i < nums1.length && j < nums2.length) {
                if (nums1[i] + diff == nums2[j])
                    j ++;
                i ++;
            }
            if (j >= nums2.length)
                return diff;
        }
        return Integer.MAX_VALUE;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}