package leetcode.editor.cn;

public class P1450_NumberOfStudentsDoingHomeworkAtAGivenTime {
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int res = 0;
        for (int i = 0; i < endTime.length; i ++) {
            if (startTime[i] <= queryTime && queryTime <= endTime[i])
                res ++;
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}