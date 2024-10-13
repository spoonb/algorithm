package leetcode.editor.cn;

import java.util.Arrays;

public class P1577_NumberOfWaysWhereSquareOfNumberIsEqualToProductOfTwoNumbers {
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int numTriplets(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        return count(nums1, nums2) + count(nums2, nums1);
    }

    private int count(int[] nums1, int[] nums2) {
        int cnt = 0;
        for (int i = 0; i < nums1.length; i++) {
            int l = 0, r = nums2.length - 1;
            long res1 = (long) nums1[i] * nums1[i];
            while (l < r) {
                long res2 = (long) nums2[l] * nums2[r];
                if (res1 < res2) {
                    r --;
                } else if (res1 > res2) {
                    l ++;
                } else {
                    if (nums2[l] == nums2[r]) {
                        cnt += (r - l + 1) * (r - l) / 2;
                        break;
                    }
                    int cntL = 0, cntR = 0;
                    int curL = nums2[l], curR = nums2[r];
                    while (curL == nums2[l]) {
                        cntL ++;
                        l ++;
                    }
                    while (curR == nums2[r]) {
                        cntR ++;
                        r --;
                    }
                    cnt += cntL * cntR;
                }
            }
        }
        return cnt;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}