//import java.util.HashMap;
//import java.util.Map;
import java.util.*;

public class FindFrequencyWords {
	
	public static Map<String, Integer> findWordsFrequency(String str){
        String[] words = str.split("\\s+");
        HashMap<String, Integer> countWordsFreq = new HashMap<>();
        for(String word : words){
            countWordsFreq.put(word,countWordsFreq.getOrDefault(word,0)+1);
        }
        return countWordsFreq;
    }
	
	public static Map<Character, Integer> findCharacterFreq(String s){
        HashMap<Character, Integer> countFreq = new HashMap<>();
        for(char c : s.toCharArray()){
            countFreq.put(c, countFreq.getOrDefault(c,0)+1);
        }
        return countFreq;
    }

	public static void main(String[] args) {

		String str = "Subham is a software engineer who is passionate about testing and learning new technologies";
        HashMap<String, Integer> result = (HashMap<String, Integer>) findWordsFrequency(str);
        System.out.println(result);
        
        String[] words = str.split("\\s+");
        for(String w : words){
            HashMap<Character, Integer> freq = (HashMap<Character, Integer>)findCharacterFreq(w);
            System.out.println(freq);
        }
        
	}

}
