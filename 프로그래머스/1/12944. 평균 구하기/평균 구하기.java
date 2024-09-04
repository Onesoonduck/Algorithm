class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        int len = arr.length;
        
        for (int num : arr) {
            answer += num;
        }
        
        
        return answer / (len);
    }
}