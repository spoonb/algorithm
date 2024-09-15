package leetcode.editor.cn;

public class P2269_FindTheKBeautyOfANumber {
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int divisorSubstrings(int num, int k) {
        String s = String.valueOf(num);
        int res = 0;
        for (int i = 0; i <= s.length() - k; i++) {
            int cur = Integer.parseInt(s.substring(i, i + k));
            if (cur != 0 && num % cur == 0)
                res ++;
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}