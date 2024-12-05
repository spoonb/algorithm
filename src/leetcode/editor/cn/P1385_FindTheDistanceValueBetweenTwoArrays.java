package leetcode.editor.cn;

import java.util.Arrays;

public class P1385_FindTheDistanceValueBetweenTwoArrays {
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i = 0, j = 1;
        int res = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                if (Math.abs(arr1[i] - arr2[j]) > d && Math.abs(arr1[i] - arr2[j - 1]) > d) {
                    res ++;
                }
                i ++;
            } else if (arr1[i] > arr2[j]) {
                j ++;
            } else {
                i ++;
                j ++;
            }
        }
        while (i < arr1.length) {
            if (Math.abs(arr1[i] - arr2[arr2.length - 1]) > d) {
                res ++;
            }
            i ++;
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}