
public class FindSquareSumMatch {
	
	public static void findSquareMatch(int[] n){
        int match = 0;
        int unmatch = 0;
        int squareSum = (int)(Math.pow(n[n.length-1],2)+Math.pow(n[n.length-2],2));
        //System.out.println(squareSum);
        for(int i=0;i<n.length;i++){
            if(squareSum==n[i]){
                match++;
            }else{
                unmatch++;
            }
        }
        System.out.println("Match count: "+match);
        System.out.println("Unmatch count: "+unmatch);
    }

	public static void main(String[] args) {
		
		int[] n = {13,12,4,13,5,6,2,3};
        findSquareMatch(n);

	}

}
