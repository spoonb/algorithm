package leetcode.editor.cn;

public class P2337_MovePiecesToObtainAString {
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean canChange(String start, String target) {
        int len = start.length();
        int i = 0, j = 0;
        while (true) {
            while (i < len && start.charAt(i) == '_') i ++;
            while (j < len && target.charAt(j) == '_') j ++;
            if (i >= len || j >= len) break;
            if (start.charAt(i) != target.charAt(j)) {
                return false;
            } else if (start.charAt(i) == 'L') {
                if (i < j) return false;
            } else if (start.charAt(i) == 'R') {
                if (i > j) return false;
            }
            i ++;
            j ++;
        }
        return i == j;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}