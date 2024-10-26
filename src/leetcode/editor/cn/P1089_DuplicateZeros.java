package leetcode.editor.cn;

public class P1089_DuplicateZeros {
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public void duplicateZeros(int[] arr) {
        int len = arr.length;
        int[] res = new int[len];
        int i = 0, j = 0;
        while (j < len) {
            res[j ++] = arr[i];
            if (i < len && j < len && arr[i] == 0) {
                res[j] = 0;
            }
            i ++;
            j ++;
        }
        System.arraycopy(res, 0, arr, 0, len);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}