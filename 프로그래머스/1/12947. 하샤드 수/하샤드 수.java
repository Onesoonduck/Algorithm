class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int num = 0;
        
        String str = Integer.toString(x);
        
        for (int i = 0; i < str.length(); i++) {
            num += Character.getNumericValue(str.charAt(i));
        }
        
        if (x % num == 0) {
            answer = true;
        } else {
            answer = false;
        }
    
        return answer;
    }
}