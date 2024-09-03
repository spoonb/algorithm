package leetcode.editor.cn;

public class P912_SortAnArray {
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] sortArray(int[] nums) {
        return mergeSort(nums, 0, nums.length - 1);
    }

    private int[] mergeSort(int[] nums, int l, int r) {
        if (l >= r) return new int[] {nums[l]};
        int mid = l + r >> 1;
        int[] left = mergeSort(nums, l, mid);
        int[] right = mergeSort(nums, mid + 1, r);
        int[] merged = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j])
                merged[k ++] = left[i ++];
            else
                merged[k ++] = right[j ++];
        }
        while (i < left.length)
            merged[k ++] = left[i ++];
        while (j < right.length)
            merged[k ++] = right[j ++];
        return merged;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}