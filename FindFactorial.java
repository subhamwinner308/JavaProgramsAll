
public class FindFactorial {
	
	public static int findFactorial(int num){
        int result = 1;
        if(num==0 || num==1){
            result = 1;
        }
        
        while(num!=1){
            result = result*num;
            num--;
        }
        return result;
    }

	public static void main(String[] args) {
		int num = 6;
        System.out.println(findFactorial(num));

	}

}
