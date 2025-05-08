import java.util.HashMap;

public class UniqueNumberOfOccurrences {
	
//	Example 1:
//
//		Input: arr = [1,2,2,1,1,3]
//		Output: true
//		Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.
//		Example 2:
//
//		Input: arr = [1,2]
//		Output: false
//		Example 3:
//
//		Input: arr = [-3,0,1,-3,1,1,1,-3,10,0]
//		Output: true
	
	public static boolean uniqueOccurrences(int[] arr) {
        //boolean result = false;
        HashMap<Integer, Integer> countOccurance = new HashMap<>();

        for(int a : arr){
            countOccurance.put(a, countOccurance.getOrDefault(a,0)+1);
        }
        if(countOccurance.size() == 1){
            return true;
        }
        else{
            HashMap<Integer, Integer> countMap = new HashMap<>();
        for(int count : countOccurance.values()){
            countMap.put(count, countMap.getOrDefault(count,0)+1);
        }
        if(countMap.size() > 1){
            HashMap<Integer, Integer> countMapFreq = new HashMap<>();

            for(int freq : countMap.values()){
                countMapFreq.put(freq, countMapFreq.getOrDefault(freq,0)+1);
            }

            if(countMapFreq.size() == 1){
                return true;
            }
            
        }
        }
        return false;
    }

	public static void main(String[] args) {
	
	int[] arr = {1,2,2,1,1,3};//true
//	int[] arr = {1,2};//false
//	int[] arr = {-3,0,1,-3,1,1,1,-3,10,0};//true
//	int[] arr = {5,3,2,-3,-2,-2};//false
	System.out.println(uniqueOccurrences(arr));	
	
	}

}
