package coding;

public class Merge_Sort_int {

	public static void main(String[] args)
	{
		int ar[]= {4,6,7,2,1,3,5,9,8};
		mergeSort(ar);
		for(int a:ar)
		{
			System.out.print(a +" ");
		}
	}

	private static void mergeSort(int[] ar) {
		
		int len=ar.length;
		int mid=len/2;
		if(len<=1)
		{
			return;
		}
		int[] leftArray=new int[mid];
		int[] rightArray=new int[len-mid];
		int i=0,j=0;
		for(;i<len;i++)
		{
			if(i<mid)
			{
				leftArray[i]=ar[i];
			}
			else
			{
				rightArray[j]=ar[i];
				j++;
			}
		}
		mergeSort(leftArray);
		mergeSort(rightArray);
		merge(leftArray,rightArray,ar);
		
	}

	private static void merge(int[] leftArray, int[] rightArray, int[] ar) {
		int lsize=ar.length/2;
		int rsize=ar.length -lsize;
		int i=0,l=0,r=0;
		while(l<lsize&&r<rsize)
		{
			if(leftArray[l]<rightArray[r])
			{
				ar[i]=leftArray[l];
				i++;
				l++;
			}
			else
			{
				ar[i]=rightArray[r];
				i++;
				r++;
			}
		}
		while(l<lsize)
		{
			ar[i]=leftArray[l];
			i++;
			l++;
		}
		while(r<rsize)
		{
			ar[i]=rightArray[r];
			i++;
			r++;
		}
		
	}

}
