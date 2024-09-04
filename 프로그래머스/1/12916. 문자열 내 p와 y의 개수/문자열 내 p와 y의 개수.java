class Solution {
    boolean solution(String s) {
        boolean answer = true;
        String str = s.toLowerCase();
        int num = 0;
        
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'p') {
                num++;
            } else if (str.charAt(i) == 'y') {
                num--;
            }
        }
        
        if (num == 0) {
            answer = true;
        } else {
            answer = false;
        }
        

        return answer;
    }
}