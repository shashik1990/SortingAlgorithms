
public class Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = calcuFactorial(3);
		int x = recursiveFactorial(3);
		System.out.println(n);
		System.out.println(x);
	}

	private static int calcuFactorial(int factNum) {
		// TODO Auto-generated method stub
		
		for(int i=factNum-1; i>0;i--) {
			factNum *= i;
		}
		
		return factNum;
	}
	
	/*
	 * For a recursive function to run successfully, there must be a breaking condition
	 * otherwise it would keep running and at the end throw StackOverFlow Exception
	 */
	private static int recursiveFactorial(int factNum) {
		// TODO Auto-generated method stub
		
		if(factNum==0)
			return 1;
		return factNum * recursiveFactorial(factNum - 1);
	}
	
	

}
