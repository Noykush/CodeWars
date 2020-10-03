package main.java.HighestScoringWord;

import java.util.HashMap;
import java.util.Map;

public class Kata {
    public static String high(String s) {
        Map<String,Integer> wordScoreMap = new HashMap<String, Integer>();
        String highestWord;
        int highestScore;
        String[] splitInp = s.split(" ");
        // init first item:
        highestWord = splitInp[0];
        highestScore = calcWordScore(splitInp[0]);
        wordScoreMap.put(splitInp[0], highestScore);
       // find highest:
        for(int i = 1; i < splitInp.length; i++){
            if(!wordScoreMap.containsKey(splitInp[i])) {
                int score = calcWordScore(splitInp[i]);
                wordScoreMap.put(splitInp[i], score);
                if (score > highestScore) { //update
                    highestScore = score;
                    highestWord = splitInp[i];
                }
            }
        }
        return highestWord;
    }

    private static int calcWordScore(String str){
        int sum = 0;
        for(int i  = 0; i < str.length(); i++){
            sum += (str.charAt(i) - 'a') + 1 ;
        }
        return  sum;
    }
}
