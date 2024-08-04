package leetcode.editor.cn;

public class P668_KthSmallestNumberInMultiplicationTable {

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findKthNumber(int m, int n, int k) {
        int l = 1, r = m * n;
        while (l < r) {
            int mid = l + r >> 1;
            if (cnt(m, n, mid) >= k)
                r = mid;
            else
                l = mid + 1;
        }
        return l;
    }

    private int cnt(int m, int n, int mid) {
        int count = 0;
        for (int i = 1; i <= m; i ++) {
            count += Math.min(mid/i, n);
        }
        return count;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}