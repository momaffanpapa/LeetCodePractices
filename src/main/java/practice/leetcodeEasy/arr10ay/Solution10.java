package practice.leetcodeEasy.arr10ay;

import java.util.HashMap;
import java.util.Map;

public class Solution10 {

    public static boolean checkIfPangram(String sentence) {
        sentence=sentence.toLowerCase();
        Map<Character,Integer> mapObject=new HashMap<>();;
        for(int i=0;i<sentence.length();i++){
            mapObject.put(sentence.charAt(i),1);
        }
        return mapObject.size()==26?true:false;
    }

    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(sentence));
    }
}
