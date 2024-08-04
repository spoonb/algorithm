package leetcode.editor.cn;

public class P74_SearchA2dMatrix {

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length;
        int l = 0, r = m * n - 1;
        while (l < r) {
            int mid = l + r >> 1;
            if (matrix[mid / n][mid % n] >= target)
                r = mid;
            else
                l = mid + 1;
        }
        if (matrix[l / n][l % n] == target)
            return true;
        return false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}