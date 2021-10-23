package LeetCode.Easy;

import java.util.ArrayList;
import java.util.HashSet;

public class easy771_JewelsandStones {
    public static void main(String[] args) {
        System.out.print(numJewelsInStones("aaA", "aAAbbbb"));
    }
    public static int numJewelsInStones(String jewels, String stones) {
        HashSet<String> jewelsSetData = new HashSet<>();
        String[] jewelsArr = jewels.split("");

        for(String v : jewelsArr){
            jewelsSetData.add(v);
        }
        String parseJewels = String.join("", jewelsSetData);

        ArrayList<String> stonList = new ArrayList<>();
        String[] stonesArr = stones.split("");

        for(String v : stonesArr){
            stonList.add(v);
        }
        int sameCount = 0;
        for(String v : stonList){
            if(parseJewels.contains(v)) sameCount++;
        }
        return sameCount;
    }
}

