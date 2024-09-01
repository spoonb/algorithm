package leetcode.editor.cn;

public class P134_GasStation {
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int i = 0;
        while (i < n) {
            int cnt = 0, sum = 0;
            while (cnt < n) {
                int idx = (i + cnt) % n;
                sum += gas[idx] - cost[idx];
                if (sum < 0) break;
                cnt ++;
            }
            if (cnt == n) return i;
            else i = i + cnt + 1;
        }
        return -1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}