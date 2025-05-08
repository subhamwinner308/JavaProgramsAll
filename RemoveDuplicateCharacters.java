import java.util.HashSet;

public class RemoveDuplicateCharacters {
	
	public static String removeDuplicate(String word) {
		
		HashSet<Character> charSet = new HashSet<>();
		
		StringBuilder result = new StringBuilder();
		
		//HashSet does Not allow duplicate characters
		for(char c:word.toCharArray()) {
			if(!charSet.contains(c)) {
				charSet.add(c);
				result.append(c);
			}
		}
		
		return result.toString();
	}
	
	public static void main(String[] args) {
	String word = "leetcode";
	
	System.out.println(removeDuplicate(word));

	}

}
