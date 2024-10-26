package leetcode.editor.cn;

public class P88_MergeSortedArray {
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] res = new int[m + n];
        int i = 0, j = 0, k = 0;
        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                res[k ++] = nums1[i ++];
            } else {
                res[k ++] = nums2[j ++];
            }
        }
        while (i < m)
            res[k ++] = nums1[i ++];
        while (j < n)
            res[k ++] = nums2[j ++];
        System.arraycopy(res, 0, nums1, 0, n + m);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}