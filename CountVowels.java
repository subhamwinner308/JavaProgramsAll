
public class CountVowels {
	
	public static int countVowels(String s) {
		int count = 0;
		String vowels = "aeiouAEIOU";
		
		for(int i=0;i<s.length();i++) {
			if(vowels.contains(String.valueOf(s.charAt(i)))){
				count++;
			}
		}
		
		return count;
	}

	public static void main(String[] args) {
		
		String s = "Subham";
		
		System.out.println(countVowels(s));

	}

}
