package leetcode.editor.cn;

public class P1456_MaximumNumberOfVowelsInASubstringOfGivenLength {
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxVowels(String s, int k) {
        byte[] vowels = new byte[26];
        for (char c : "aeiou".toCharArray()) {
            vowels[c - 'a'] = 1;
        }
        int cnt = 0, res = 0;
        for (int i = 0; i < s.length(); i++) {
            cnt += vowels[s.charAt(i) - 'a'];
            if (i >= k)
                cnt -= vowels[s.charAt(i - k) - 'a'];
            res = Math.max(res, cnt);
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}