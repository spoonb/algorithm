package leetcode.editor.cn;

public class P1292_MaximumSideLengthOfASquareWithSumLessThanOrEqualToThreshold {
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

    private int[][] sum;
    private int m, n;

    public int maxSideLength(int[][] mat, int threshold) {
        m = mat.length;
        n = mat[0].length;
        sumInit(mat);
        int l = 1, r = Math.min(m, n);
        int res = 0;
        while (l <= r) {
            int mid = l + r >> 1;
            if (lessThanThreshold(mid, threshold)) {
                res = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return res;
    }

    private void sumInit(int[][] mat) {
        sum = new int[m+1][n+1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                sum[i][j] = mat[i-1][j-1];
                sum[i][j] += sum[i-1][j] + sum[i][j-1] - sum[i-1][j-1];
            }
        }
    }

    private boolean lessThanThreshold(int mid, int threshold) {
        for (int i = 1; i <= m+1-mid; i ++) {
            for (int j = 1; j <= n+1-mid; j ++) {
                int cur = sum[i+mid-1][j+mid-1]-sum[i-1][j+mid-1]-sum[i+mid-1][j-1] + sum[i-1][j-1];
                if (cur <= threshold) {
                    return true;
                }
            }
        }
        return false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}