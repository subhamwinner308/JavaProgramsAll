
public class ReverseLastWord {

	public static void main(String[] args) {
		
		String str = "India  is    incredible";
		
        String[] words = str.split("\\s+");
        
        String lastWord = words[words.length-1];
        for(int i=0;i<words.length-1;i++){
            System.out.print(words[i]+" ");
        }
        for(int j=lastWord.length()-1;j>=0;j--){
            System.out.print(lastWord.charAt(j));
        }

	}

}
