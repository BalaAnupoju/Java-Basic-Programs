package coding;

public class Bubble_sort_int {

	public static void main(String[] args) {
		int[] a= {9,1,8,2,7,3,6,4,5};
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-1-i;j++) 
			{
				if(a[j]>a[j+1])
				{
					int temp= a[j];
					a[j]=a[j+1];
					a[j+1]= temp;
				}
				
			}
		}
		for(int b: a)
		{
			System.out.print(b+ " ");
		}


	}

}
