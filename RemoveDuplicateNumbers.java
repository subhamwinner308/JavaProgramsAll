import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateNumbers {
	
	public static int[] removeDuplicateNumbers(int[] numbers) {
		
		Set<Integer> uniqueSet = new HashSet<>();
		
		//Set does Not allow duplicate elements
		for(int n:numbers) {
			uniqueSet.add(n);
		}
		
		int[] result = new int[uniqueSet.size()];
		
		int index = 0;
		
		for(int n:uniqueSet) {
			result[index++] = n;
		}
		
		return result;
		
	}

	public static void main(String[] args) {
	int[] numbers = {1,2,2,3,4,5,5};
	int[] result = removeDuplicateNumbers(numbers);
	
	System.out.println(Arrays.toString(result));

	}

}
