package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P911_OnlineElection {
    
//leetcode submit region begin(Prohibit modification and deletion)
class TopVotedCandidate {

    private int[] times;
    private List<Integer> tops = new ArrayList<>();
    private Map<Integer, Integer> votes = new HashMap<>();

    public TopVotedCandidate(int[] persons, int[] times) {
        votes.put(-1, -1);
        int top = -1;
        for (int i = 0; i < persons.length; i++) {
            votes.put(persons[i], votes.getOrDefault(persons[i], 0) + 1);
            if (votes.get(persons[i]) >= votes.get(top)) {
                top = persons[i];
            }
            tops.add(top);
        }
        this.times = times;
    }

    public int q(int t) {
        int l = 0, r = times.length - 1;
        while (l < r) {
            int mid = l + r + 1 >> 1;
            if (t >= times[mid])
                l = mid;
            else
                r = mid - 1;
        }
        return tops.get(l);
    }
}

/**
 * Your TopVotedCandidate object will be instantiated and called as such:
 * TopVotedCandidate obj = new TopVotedCandidate(persons, times);
 * int param_1 = obj.q(t);
 */

/**
 * Your TopVotedCandidate object will be instantiated and called as such:
 * TopVotedCandidate obj = new TopVotedCandidate(persons, times);
 * int param_1 = obj.q(t);
 */
//leetcode submit region end(Prohibit modification and deletion)

}