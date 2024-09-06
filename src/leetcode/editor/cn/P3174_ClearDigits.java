package leetcode.editor.cn;

public class P3174_ClearDigits {
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String clearDigits(String s) {
        int i = -1;
        while ((i = digit(s)) >= 0) {
            s = s.substring(0, i) + s.substring(i + 2);
        }
        return s;
    }

    private int digit(String s) {
        int idx = -1;
        for (int i = 0; i < s.length(); i ++) {
            if (s.charAt(i) - '0' <= 9) {
                idx = i - 1;
                break;
            }
        }
        return idx;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}