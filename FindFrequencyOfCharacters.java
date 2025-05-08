import java.util.HashMap;

public class FindFrequencyOfCharacters {
	
	public static void printFrequencyUsingHashMap(String str) {
		str = str.toLowerCase();
		
		HashMap<Character, Integer> countChar = new HashMap<>();
		
		for(char c : str.toCharArray()) {
			countChar.put(c, countChar.getOrDefault(c,0)+1);
		}
		
		for(char c : countChar.keySet()) {
			System.out.println(c+" - "+countChar.get(c));
		}
	}
	
	public static void printFrequencyChar(String str) {
		str = str.toLowerCase();
		
		int[] freq = new int[256];
		
		for(char c : str.toCharArray()) {
			freq[c]++;
		}
		
		for(int i=0;i<256;i++) {
			if(freq[i]!=0) {
				System.out.println((char)i + " : "+freq[i]);
			}
		}
		
	}

	public static void main(String[] args) {
		
		String str = "Hello World";
		
		printFrequencyChar(str);
		printFrequencyUsingHashMap(str);

	}

}
