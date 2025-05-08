
public class FindMax {

	public static void main(String[] args) {
		
		int[] num = {6,8,10,2,9,0};
		
		int max = num[0];
		
		for(int i=0;i<num.length;i++) {
			if(num[i]>max) {
				max = num[i];
			}
		}
		
		System.out.println(max);
		
	}

}
