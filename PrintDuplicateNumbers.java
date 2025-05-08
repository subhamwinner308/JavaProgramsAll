import java.util.HashMap;
import java.util.Map;

public class PrintDuplicateNumbers {
	
	public static void findDuplicates(int[] arr){
        Map<Integer, Integer> countDupl = new HashMap<>();
        
        for(int n : arr){
            countDupl.put(n,countDupl.getOrDefault(n,0)+1);
        }
        for(int num : countDupl.keySet()){
            if(countDupl.get(num)>1){
                System.out.println(num+" - "+countDupl.get(num));
            }
        }
    }

	public static void main(String[] args) {
		int[] nums = {12,23,45,90,78,65,89,12,23,12,45,23};
        findDuplicates(nums);

	}

}
