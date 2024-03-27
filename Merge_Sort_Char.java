package coding;

public class Merge_Sort_Char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char ar[]= {'b','z','d','v','w','q','s','a','T','I'};
		mergeSort(ar);
		for(char a:ar)
		{
			System.out.print(a +" ");
		}
	}

	private static void mergeSort(char[] ar) {
		
		int len=ar.length;
		int mid=len/2;
		if(len<=1)
		{
			return;
		}
		char[] leftArray=new char[mid];
		char[] rightArray=new char[len-mid];
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

	private static void merge(char[] leftArray, char[] rightArray, char[] ar) {
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
