package leetcode.editor.cn;

public class P2486_AppendCharactersToStringToMakeSubsequence {
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int appendCharacters(String s, String t) {
        int i = 0, j = 0;
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        while (i < sArr.length && j < tArr.length) {
            if (sArr[i] == tArr[j])
                j ++;
            i ++;
        }
        return tArr.length - j;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}