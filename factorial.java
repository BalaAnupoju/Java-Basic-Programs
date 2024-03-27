package preparation;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n=5;
        int fact=1;
        fact=factorial(n);
         System.out.println(fact);
}

	private static int factorial(int n) {
		if(n==0) {
		return 1;
	}
		else
		{
			return n*factorial(n-1);
		}
}
}