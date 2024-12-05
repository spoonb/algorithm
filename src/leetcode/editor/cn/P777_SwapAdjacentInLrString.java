package leetcode.editor.cn;

public class P777_SwapAdjacentInLrString {
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean canTransform(String start, String result) {
        int len = start.length();
        int i = 0, j = 0;
        while (true) {
            while (i < len && start.charAt(i) == 'X') i ++;
            while (j < len && result.charAt(j) == 'X') j ++;
            if (i >= len || j >= len) break;
            if (start.charAt(i) != result.charAt(j)) {
                return false;
            } else if (start.charAt(i) == 'L') {
                if (i < j) return false;
            } else if (start.charAt(i) == 'R') {
                if (i > j) return false;
            }
            i ++;
            j ++;
        }
        if (i < len && start.charAt(i) != 'X') return false;
        if (j < len && result.charAt(j) != 'X') return false;
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}