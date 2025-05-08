
public class ReverseVowels {
	
	public static String reverseVowels(String s) {
		char[] chars = s.toCharArray();
		
		String vowels = "aeiouAEIOU";
		
		int left = 0;
		int right = s.length()-1;
		
		while(left<right){
			if(!vowels.contains(String.valueOf(chars[left]))) {
				left++;
			}
			else if(!vowels.contains(String.valueOf(chars[right]))) {
				right--;
			}
			else {
				char temp = chars[left];
				chars[left] = chars[right];
				chars[right] = temp;
				
				left++;
				right--;
			}
		}
		
		return new String(chars);
	}

	public static void main(String[] args) {
		
		String input = "leetcode";
		System.out.println("Input String: "+input);
		System.out.println("Output String: "+reverseVowels(input));

	}

}
