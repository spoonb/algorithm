package leetcode.editor.cn;

public class P793_PreimageSizeOfFactorialZeroesFunction {
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int preimageSizeFZF(int k) {
        return (int) (conform(k + 1) - conform(k));
    }

    private long conform(int k) {
        long l = 0, r = 5L * k;
        while (l < r) {
            long mid = (l + r) / 2;
            if (zero(mid) >= k)
                r = mid;
            else
                l = mid + 1;
        }
        return l;
    }

    private long zero(long n) {
        long cnt = 0;
        while ((n /= 5) > 0)
            cnt += n;
        return cnt;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}