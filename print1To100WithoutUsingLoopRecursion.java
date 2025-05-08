import java.util.Arrays;

public class print1To100WithoutUsingLoopRecursion {

	public static void main(String[] args) {
		
		//1. Arrays fill:
		Object num[] = new Object[100];
		
		Arrays.fill(num, new Object() {
			int count = 0;
			@Override
			public String toString() {
				return Integer.toString(++count);
			}
		});
		
		System.out.println(Arrays.toString(num));
		
	}

}
