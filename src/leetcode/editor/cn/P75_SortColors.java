package leetcode.editor.cn;

public class P75_SortColors {
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public void sortColors(int[] nums) {
        int l = 0, r = nums.length - 1;
        quickSort(nums, l, r);
    }

    private void quickSort(int[] nums, int l, int r) {
        if (l >= r) return;
        int i = l - 1, j = r + 1;
        int x = nums[l + r >> 1];
        while (i < j) {
            while (nums[++ i] < x);
            while (nums[-- j] > x);
            if (i < j) {
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
            }
        }
        quickSort(nums, l, j);
        quickSort(nums, j + 1, r);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}