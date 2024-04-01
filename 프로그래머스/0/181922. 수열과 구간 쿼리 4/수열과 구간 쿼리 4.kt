import java.util.*

class Solution {
    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
        var answer = arr

        queries.forEach{
            for(i in 0 .. answer.size-1) {
                if(i in (it[0] .. it[1])){
                    if(i % it[2] == 0 ) answer[i]++
                }
            }
        }

        return answer;
    }
}