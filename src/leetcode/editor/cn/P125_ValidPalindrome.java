package leetcode.editor.cn;

public class P125_ValidPalindrome {
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toLowerCase().toCharArray()) {
            if ((c >= 48 && c <= 57) || (c >= 97 && c <= 122))
                sb.append(c);
        }
        char[] arr = sb.toString().toCharArray();
        for (int i = 0, j = arr.length - 1; i <= j; i++, j --) {
            if (arr[i] != arr[j])
                return false;
        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}