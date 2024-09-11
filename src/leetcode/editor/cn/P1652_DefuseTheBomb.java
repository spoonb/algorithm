package leetcode.editor.cn;

public class P1652_DefuseTheBomb {
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] decrypt(int[] code, int k) {
        int len = code.length;
        if (k == 0) return new int[len];
        int l = k > 0 ? 1 : len + k;
        int r = k > 0 ? k : len - 1;
        int[] res = new int[len];
        int sum = 0;
        for (int i = l; i <= r; i ++)
            sum += code[i];
        for (int i = 0; i < len; i ++) {
            res[i] = sum;
            sum -= code[l];
            sum += code[(r + 1) % len];
            l = (l + 1) % len;
            r = (r + 1) % len;
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}