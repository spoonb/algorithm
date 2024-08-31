package leetcode.editor.cn;

public class P26_RemoveDuplicatesFromSortedArray {
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        if (len <= 1) return len;
        int slow = 1, fast = 1;
        while (fast < len) {
            if (nums[slow - 1] < nums[fast]) {
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