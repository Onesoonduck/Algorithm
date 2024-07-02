import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> q = new LinkedList<>();
        List<Integer> answer = new ArrayList<>();
        
        for (int i = 0; i < progresses.length; i++) {
            if ((100 - progresses[i]) % speeds[i] == 0) {
                q.add((100 - progresses[i]) / speeds[i]);
            } else {
                q.add((100 - progresses[i]) / speeds[i] + 1);
            }
        }
        
        int day = q.poll();
        int count = 1;
        
        while (!q.isEmpty()) {
            if (day >= q.peek()) {
                count++;
                q.poll();
            } else {
                answer.add(count);
                count = 1;
                day = q.poll();
            }
        }
        answer.add(count);
        
        return answer.stream().mapToInt(i -> i).toArray();
    }
}