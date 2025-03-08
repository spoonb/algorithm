package leetcode.editor.cn;

import java.util.Arrays;

public class P面试题_16_06_SmallestDifferenceLcci {
    
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int smallestDifference(int[] a, int[] b) {
            Arrays.sort(a);
            Arrays.sort(b);
            int i = 0, j = 0;
            long diff = Long.MAX_VALUE;
            while (i < a.length && j < b.length) {
                long cur = Math.abs((long) a[i] - b[j]);
                if (a[i] <= b[j]) {
                    i ++;
                } else {
                    j ++;
                }
                diff = Math.min(diff, cur);
            }
            while (i < a.length) {
                long cur = Math.abs((long) a[i] - b[b.length - 1]);
                diff = Math.min(diff, cur);
                i ++;
            }
            while (j < b.length) {
                long cur = Math.abs((long) a[a.length - 1] - b[j]);
                diff = Math.min(diff, cur);
                j ++;
            }
            return (int) diff;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}