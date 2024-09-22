package leetcode.editor.cn;

public class P2904_ShortestAndLexicographicallySmallestBeautifulString {
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int l = 0, r = 0, cnt = 0;
        String res = s;
        for (;r < s.length(); r ++) {
            char c = s.charAt(r);
            if (c == '0') continue;
            cnt += c - '0';
            while (cnt > k || (l <= r && s.charAt(l) == '0')) {
                cnt -= s.charAt(l ++) - '0';
            }
            if (cnt == k) {
                String tmp = s.substring(l, r + 1);
                if (compare(tmp, res) < 0)
                    res = tmp;
            }
        }
        return cnt == k ? res : "";
    }

    // 手写字符串字典序比较器
    private int compare(String tmp, String res) {
        if (tmp.length() < res.length())
            return -1;
        else if (tmp.length() == res.length())
            for (int i = 0; i < res.length(); i ++)
                if (tmp.charAt(i) != res.charAt(i))
                    return tmp.charAt(i) - res.charAt(i);
        return 1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}