import java.util.stream.IntStream;

public class printNumberWithoutLoop {
	
	/*
	 * Print 1 to 100 without using loop
	 * 1. Recursive function
	 * 2. Java Streams
	 */

	public static void main(String[] args) {
		
		//printNum(1);
		//printNum(1,100);
		
		IntStream.range(1, 101).forEach(e -> System.out.println(e));
		
	}
	
	public static void printNum(int num) {
		if(num<=100) {
			System.out.println(num);
			num++;
			printNum(num);
		}
	}
	
	public static void printNum(int strtNum, int endNum) {
		if(strtNum<=endNum) {
			System.out.println(strtNum);
			strtNum++;
			printNum(strtNum,endNum);
		}
	}

}
