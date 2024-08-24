package leetcode.editor.cn;

public class P26_RemoveDuplicatesFromSortedArray {
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int removeDuplicates(int[] nums) {
        int l = 0, r = 1;
        int cnt = 1;
        while (r < nums.length) {
            if (nums[l] < nums[r]) {
                int tmp = nums[r];
                nums[r] = nums[l ++];
                nums[l] = tmp;
                cnt ++;
            }
            r ++;
        }
        return cnt;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}