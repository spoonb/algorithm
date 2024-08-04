package leetcode.editor.cn;

public class P69_Sqrtx {

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int mySqrt(int x) {
        double l = 0, r = x;
        while (r - l > 0.1) {
            double mid = (l + r) / 2;
            double sqrt = mid * mid;
            if (sqrt >= x)
                r = mid;
            else
                l = mid;
        }
        if ((int) r * (int) r <= x)
            return (int) r;
        return (int) l;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}