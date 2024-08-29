class Solution {
    public String solution(String my_string, String letter) {
        StringBuilder answer = new StringBuilder();
        char letterChar = letter.charAt(0);

        char[] str = my_string.toCharArray();

        for (char str1 : str) {
            if (str1 != letterChar) {
                answer.append(str1);
            }
        }

        return answer.toString();
    }
}