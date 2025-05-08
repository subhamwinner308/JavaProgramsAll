
public class ReverseStringOperationsAll {
	
	public static String reverse(String s){
        if(s.length()==0){
            return " ";
        }
        return s.charAt(s.length()-1)+reverse(s.substring(0,s.length()-1));
    }
    
    public static void reverseOddPositionWords(String str){
        String[] words = str.split("\\s+");
        for(int i=0;i<words.length;i++){
            if((i+1)%2==1){
                words[i] = reverse(words[i]);
            }
        }
        
        for(int i=0;i<words.length;i++){
            System.out.print(words[i]+" ");
        }
    }
    
    public static void reverseLastWord(String str){
        String[] words = str.split("\\s+");
        
        for(int i=0;i<words.length-1;i++){
            System.out.print(words[i]+" ");
        }
        System.out.print(reverse(words[words.length-1]));
    }
    
	public static void main(String[] args) {
		String str = "India  is    incredible";
        reverseLastWord(str);
        System.out.println();
        reverseOddPositionWords(str);

	}

}
