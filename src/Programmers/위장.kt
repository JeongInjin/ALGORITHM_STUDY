package Programmers

import java.util.*

class 위장 {
    fun solution(clothes: Array<Array<String>>): Int {
        var answer = 1
        var map = HashMap<String, Int>()

        for((i, item) in clothes)
            map.put(item, map.getOrDefault(item, 0) + 1)

        for((k, v) in map){
            answer *= v + 1
        }

        return answer - 1;
    }

    //워..이게 뭐람.. 나의 풀이가 초라해 보이는군..ㅋㅋ;
    class Solution2 {
        fun solution(clothes: Array<Array<String>>): Int {
            return clothes.groupBy { it[1] }.values.fold(1) { acc, v -> acc * (v.size + 1) }  - 1
        }
    }

}