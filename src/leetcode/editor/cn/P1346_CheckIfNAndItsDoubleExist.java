package leetcode.editor.cn;

import java.util.Arrays;

public class P1346_CheckIfNAndItsDoubleExist {
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        int l = 0, r = 1;
        while (r < arr.length) {
            if (arr[r] > 0) {
                if (2 * arr[l] < arr[r]) {
                    l ++;
                } else if (2 * arr[l] > arr[r]) {
                    r ++;
                } else {
                    return true;
                }
            } else if (arr[r] < 0) {
                if (2 * arr[r] > arr[l]) {
                    l ++;
                } else if (2 * arr[r] < arr[l]) {
                    r ++;
                } else {
                    return true;
                }
            } else {
                if (2 * arr[l] < arr[r]) {
                    l ++;
                } else if (2 * arr[l] > arr[r]) {
                    r ++;
                } else if (l != r) {
                    return true;
                } else {
                    r ++;
                }
            }
        }
        return false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}