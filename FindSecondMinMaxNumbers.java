import java.util.*;
public class FindSecondMinMaxNumbers {
	
	public static int[] bubbleSort(int[] num){
        for(int i=0;i<num.length-1;i++){
            for(int j=0;j<num.length-1-i;j++){
                if(num[j]>num[j+1]){
                    int temp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = temp;
                }
            }
        }
        return num;
    }

	public static void main(String[] args) {
		int[] num = {11,17,6,3,4,0,1};
        // Arrays.sort(num);
        //System.out.println(Arrays.toString(num));
        bubbleSort(num);
        int[] result = new int[num.length];
        for(int i=0;i<result.length;i++){
            result[i] = num[i];
        }
        System.out.println(Arrays.toString(result));
        System.out.println(result[1]+" "+result[result.length-2]);
        
	}

}
