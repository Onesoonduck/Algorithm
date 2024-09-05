class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        int i, j;

        if (a >= b) {
            i = b;
            j = a;
        } else {
            i = a;
            j = b;
        }
        
        for (; i <= j; i++) {
            answer += (long) i;
        }
        
        return answer;
    }
}

