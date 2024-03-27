package preparation;

public class fibonacci {

	public static void main(String[] args) {
	int n1=0;
		int n2=1;
		System.out.println(n1);
      	System.out.println(n2);
		
	for(int i=0;i<10;i++) 
	{
	int n3=n1+n2;
		n1=n2;
		n2=n3;
		System.out.println(n3);
		
	}
		System.out.println("__________________________________________");
		
		System.out.println("using function");
		int fib = fibonacci();
		System.out.println(fib);
      
}

	private static int fibonacci() {
		// TODO Auto-generated method stub
		int n1=0;
		int n2=1;
	System.out.println(n1);
	System.out.println(n2);
		for(int i=0;i<10;i++)
		{
			int n3=n1+n2;
			n1=n2;
			n2=n3;
		
		System.out.println(n3);
		}
		
		return 0;
	}
	}
