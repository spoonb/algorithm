package leetcode.editor.cn;

public class P80_RemoveDuplicatesFromSortedArrayIi {
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        if (len <= 2) return len;
        int slow = 2, fast = 2;
        while (fast < len) {
            if (nums[slow - 2] < nums[fast]) {
                nums[slow] = nums[fast];
                slow ++;
            }
            fast ++;
        }
        return slow;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}