import java.util.ArrayList;
import java.util.HashMap;

public class FindNonRepeatingNumber {
	
	public static int findNonRepeatingNumber(int[] numbers) {
		
		HashMap<Integer, Integer> numCount = new HashMap<>();
		int d = -1;
		for(int n:numbers) {
			numCount.put(n,numCount.getOrDefault(n,0)+1);
		}
		
		for(int n:numbers) {
			if(numCount.get(n) == 1) {
				d = n;
			}
		}
		return d;
	}

	public static void main(String[] args) {
		
		int[] numbers = {4,1,3,2,0,0,1,3,2,4};
		
		System.out.println(findNonRepeatingNumber(numbers));

	}

}
