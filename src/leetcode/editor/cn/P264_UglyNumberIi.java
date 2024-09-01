package leetcode.editor.cn;

public class P264_UglyNumberIi {
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int nthUglyNumber(int n) {
        int[] res = new int[n];
        res[0] = 1;
        int n2 = 0, n3 = 0, n5 = 0;
        for (int i = 1; i < n; i++) {
            res[i] = Math.min(Math.min(res[n2] * 2, res[n3] * 3), res[n5] * 5);
            if (res[i] % 2 == 0) n2 ++;
            if (res[i] % 3 == 0) n3 ++;
            if (res[i] % 5 == 0) n5 ++;
        }
        return res[n - 1];
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}