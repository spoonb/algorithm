package leetcode.editor.cn;

import java.util.Arrays;

public class P1471_TheKStrongestValuesInAnArray {
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] getStrongest(int[] arr, int k) {
        Arrays.sort(arr);
        int mid = arr[(arr.length - 1) / 2];
        int[] res = new int[k];
        int l = 0, r = arr.length - 1;
        for (int i = 0; i < k; i ++) {
            if (Math.abs(arr[l] - mid) > Math.abs(arr[r] - mid)) {
                res[i] = arr[l ++];
            } else if (Math.abs(arr[l] - mid) == Math.abs(arr[r] - mid) && arr[l] > arr[r]) {
                res[i] = arr[l ++];
            } else {
                res[i] = arr[r --];
            }
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}