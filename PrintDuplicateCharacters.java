import java.util.HashMap;

public class PrintDuplicateCharacters {
	
	public static void printDuplicates(String input){

	    HashMap<Character, Integer> charCount = new HashMap<>();

	    for(char c : input.toCharArray()){
	        charCount.put(c, charCount.getOrDefault(c,0)+1);
	    }

	    for(char c : charCount.keySet()){
	        if(charCount.get(c) > 1){
	            System.out.println(c+" "+charCount.get(c));
	        }
	        
	    }

	}

	public static void main(String[] args) {
		
		String input = "publicissapient";
		printDuplicates(input);

	}

}
