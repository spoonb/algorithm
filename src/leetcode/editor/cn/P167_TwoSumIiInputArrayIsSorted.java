package leetcode.editor.cn;

public class P167_TwoSumIiInputArrayIsSorted {

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0, r = numbers.length - 1;
        while (l < r) {
            int cur = numbers[l] + numbers[r];
            if (cur < target)
                l ++;
            else if (cur > target)
                r --;
            else
                return new int[] {l + 1, r + 1};
        }
        return new int[] {-1, -1};
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}