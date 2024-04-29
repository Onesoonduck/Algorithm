class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        int l = 0;
        
        if (n % 2 == 0) {
            answer = new int[n/2];
        } else if (n % 2 == 1) {
            answer = new int[n/2 + 1];
        }
        
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 1) {
                answer[l] = i;
                l++;
            }
        }
        
        return answer;
    }
}