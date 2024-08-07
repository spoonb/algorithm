package leetcode.editor.cn;

public class P878_NthMagicalNumber {
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

    int mod = 1000000007;

    public int nthMagicalNumber(long n, int a, int b) {
        long l = 2, r = n * Math.min(a, b);
        int c = a * b / gcd(a, b);
        while (l < r) {
            long mid = (l + r) / 2;
            long cnt = mid / a + mid / b - mid / c;
            if (cnt >= n)
                r = mid;
            else
                l = mid + 1;
        }
        return (int) (l % mod);
    }

    private int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}