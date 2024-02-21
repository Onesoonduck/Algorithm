class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        int a = 1;
        int bb = 0;
        
        for (int i = 0; i < num_list.length; i++) {
            a *= num_list[i];
            bb += num_list[i];
        }
        
        int b = bb * bb;
        
        answer = a > b ? 0 : 1;
        
        return answer;
    }
}
