package leetcode.editor.cn;

public class P844_BackspaceStringCompare {
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean backspaceCompare(String s, String t) {
        int i = s.length() - 1, j = t.length() - 1;
        while (i >= 0 || j >= 0) {
            int skip = 0;
            while (i >= 0) {
                if (s.charAt(i) == '#') {
                    i --;
                    skip ++;
                } else if (skip > 0) {
                    i --;
                    skip --;
                } else {
                    break;
                }
            }
            skip = 0;
            while (j >= 0) {
                if (t.charAt(j) == '#') {
                    j --;
                    skip ++;
                } else if (skip > 0) {
                    j --;
                    skip --;
                } else {
                    break;
                }
            }
            if (i >= 0 && j >= 0) {
                if (s.charAt(i) != t.charAt(j))
                    return false;
            } else {
                if (i >= 0 || j >= 0)
                    return false;
            }
            i --;
            j --;
        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}