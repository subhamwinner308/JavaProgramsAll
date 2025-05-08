
public class PrintNumberPattern {
	
	/*
	 *  n=6
		1
		22
		3
		4444
		5
		666666
	*/
	
	public static void printPattern(int n){
        for(int i=1;i<=n;i++){
            if(i%2==1){
                System.out.println(i);
            }
            else if(i%2==0){
                for(int k=1;k<=i;k++){
                    System.out.print(i);
                }
                System.out.println();
            }
        }
    }

	public static void main(String[] args) {
		int n = 6;
        printPattern(n);

	}

}
