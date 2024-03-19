class Solution {
    public int[] solution(long n) {
        String numStr = Long.toString(n);
        int len = numStr.length();
        
        int[] answer = new int[len];
        
        for (int i = len - 1, j = 0; i >= 0; i--, j++) {
            answer[j] = numStr.charAt(i) - '0';
        }

        
        return answer;
    }
}