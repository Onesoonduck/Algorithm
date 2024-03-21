class Solution {
    public String solution(int[] numLog) {
        int l = numLog.length;
    int[] copy = new int[l];
    for(int i = 0; i < l; i++){
        copy[i] = numLog[i];
    }
    String result = "";

    for(int i = 0; i < l-1; i ++){
        int num = copy[i+1] - copy[i];
        switch(num){
        case 1:     result += "w";
                    break;
        case -1:    result += "s";
                    break;
        case 10:    result += "d";
                    break;
        case -10:   result += "a";
                    break;
            default:
                break;
        }
    }
    return result;
}
}