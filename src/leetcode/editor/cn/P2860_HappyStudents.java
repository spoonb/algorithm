package leetcode.editor.cn;

import java.util.List;

public class P2860_HappyStudents {

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int countWays(List<Integer> nums) {
        int[] arr = nums.stream().mapToInt(Integer::intValue).sorted().toArray();
        int res = arr[0] > 0 ? 1 : 0;
        for (int i = 1; i < arr.length; i ++) {
            if (arr[i - 1] <  i && i < arr[i])
                res ++;
        }
        return res + 1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}