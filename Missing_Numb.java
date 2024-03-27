package coding;

public class Missing_Numb {

	public static void main(String[] args) {
		int[] a1= {3,1,4,5};
		int n=a1.length+1;
		int sum=(n*(n+1))/2;
		for(int i=0;i<a1.length;i++) {
			sum=sum-a1[i];
		}
		System.out.println(sum);
				}

}
