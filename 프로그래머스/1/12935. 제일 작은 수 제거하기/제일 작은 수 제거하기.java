class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length - 1];
        int min = arr[0];

        if (arr.length == 1) {
            answer = new int[]{-1};
            return answer;
        }

        for (int i = 0; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
        }

        int num = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != min) {
                answer[num++] = arr[i];
            }
        }
        return answer;
    }
}