package leetcode.editor.cn;

public class P925_LongPressedName {
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isLongPressedName(String name, String typed) {
        if (name.length() > typed.length()) return false;
        int i = 0, j = 0;
        while (i < name.length() && j < typed.length()) {
            while (j < typed.length() && name.charAt(i) != typed.charAt(j)) {
                if (j != 0 && typed.charAt(j) == typed.charAt(j - 1))
                    j ++;
                else
                    return false;
            }
            if (j < typed.length()) {
                i ++;
                j ++;
            }
        }
        while (j < typed.length()) {
            if (typed.charAt(j) != typed.charAt(j - 1))
                return false;
            j ++;
        }
        // System.out.println(i);
        return i >= name.length();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}