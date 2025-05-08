/*
 * Print 1 to 100 without using numeric value 
 */
public class printNumberWithoutValue {

	public static void main(String[] args) {
		
		int one = 'A'/'A';
		String tenstr = "..........";
		int hundred = (int)Math.pow(tenstr.length(), 2);
		for(int i=one;i<=hundred;i++) {
			System.out.println(i);
		}

	}

}
