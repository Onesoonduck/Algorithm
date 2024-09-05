class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int num = 0;
        
        String[] str = String.valueOf(x).split("");
        
        for (int i = 0; i < str.length; i++) {
            num += Integer.parseInt(str[i]);
        }
        
        if (x % num == 0) {
            answer = true;
        } else {
            answer = false;
        }
    
        return answer;
    }
}