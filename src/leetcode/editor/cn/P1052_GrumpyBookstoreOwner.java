package leetcode.editor.cn;

public class P1052_GrumpyBookstoreOwner {
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int min) {
        int len = customers.length;
        int sum = 0;
        for (int i = 0; i < len; i++)
            if (grumpy[i] == 0)
                sum += customers[i];
        for (int i = 0; i < min; i++)
            sum += customers[i] * grumpy[i];
        int res = sum;
        for (int i = min; i < len; i ++) {
            sum += customers[i] * grumpy[i] - customers[i - min] * grumpy[i - min];
            res = Math.max(res, sum);
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}