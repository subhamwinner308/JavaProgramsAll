import java.util.HashMap;

public class FindWordsCount {

	public static void main(String[] args) {
		
		String str = "This is done this by Subham by";
        String str1 = str.trim().toLowerCase();
        String[] words = str1.split(" ");
        HashMap<String, Integer> countWord = new HashMap<>();
        
        for(String s : words){
            countWord.put(s, countWord.getOrDefault(s,0)+1);
        }
        
        for(String word : countWord.keySet()){
            System.out.println(word+": "+countWord.get(word));
        }

	}

}
