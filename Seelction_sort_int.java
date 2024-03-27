package coding;

public class Seelction_sort_int {

	public static void main(String[] args) {
		int ar[]= {9,1,8,2,7,3,6,4,5};
		for(int i=0;i<ar.length-1;i++)
		{
			int min=i;
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[min]>ar[j])
				{
					min=j;
				}
			}
			int temp=ar[i];
			ar[i]=ar[min];
			ar[min]=temp;
		}
		for(int b_ar: ar)
		{
			System.out.print(b_ar+ " ");
		}
		
	}

}
