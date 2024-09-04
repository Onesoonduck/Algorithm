import java.util.*;

class Solution {
    public long solution(long n) {
        String str = Long.toString(n);

        Integer[] arr = new Integer[str.length()];
        
        for (int i = 0; i < str.length(); i++) {
            String s = str.substring(i, i+1);
            arr[i] = Integer.parseInt(s);
        }
        
        Arrays.sort(arr, Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();
        for (int num : arr) {
            sb.append(num);
        }
        
        Long answer = Long.parseLong(sb.toString());
        
        return answer;
        
    }
}