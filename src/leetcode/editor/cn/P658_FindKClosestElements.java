package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

public class P658_FindKClosestElements {
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            if (r - l + 1 == k) break;
            if (Math.abs(arr[l] - x) < Math.abs(arr[r] - x)) {
                r --;
            } else if (Math.abs(arr[l] - x) == Math.abs(arr[r] - x) && arr[l] < arr[r]) {
                r --;
            } else {
                l ++;
            }
        }
        List<Integer> res = new ArrayList<>();
        for (int i = l; i <= r; i ++) {
            res.add(arr[i]);
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}