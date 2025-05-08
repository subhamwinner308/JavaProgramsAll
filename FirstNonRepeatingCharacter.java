import java.util.HashMap;

public class FirstNonRepeatingCharacter {
	
	public static char firstUniqueCharacter(String str) {
		HashMap<Character, Integer> charCount = new HashMap<>();
		char result = (char)-1;
		for(char c:str.toCharArray()) {
			charCount.put(c, charCount.getOrDefault(c,0)+1);
		}
		
		for(char c:str.toCharArray()) {
			if(charCount.get(c) == 1) {
				result = c;
			}
		}
		
		return result;
	}

	public static void main(String[] args) {
	String word = "leetcode";
	
	System.out.println(firstUniqueCharacter(word));

	}

}
