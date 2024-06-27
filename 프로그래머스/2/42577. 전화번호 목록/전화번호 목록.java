import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;       
        int leng = phone_book.length;
        
        HashMap<String, Integer> map = new HashMap<>();
        
        for (int i = 0; i < leng; i++) {
            map.put(phone_book[i], i);
        }
        
        for (int i = 0; i < leng; i++) 
            for (int j = 0; j < phone_book[i].length(); j++) 
                if (map.containsKey(phone_book[i].substring(0, j))) 
                    return false;
        
        return answer;
    }
}