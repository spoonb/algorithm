package leetcode.editor.cn;

public class P825_FriendsOfAppropriateAges {
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int numFriendRequests(int[] ages) {
        int[] cnt = new int[121];
        for (int age : ages) {
            cnt[age] ++;
        }
        int res = 0, win = 0;
        for (int L = 0, R = 0; R < cnt.length; R ++) {
            win += cnt[R];
            while (L * 2 <= R + 14) {
                win -= cnt[L];
                L ++;
            }
            if (win > 0) {
                res += cnt[R] * (win - 1);
            }
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}