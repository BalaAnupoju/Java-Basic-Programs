package coding;

public class InterPolationSearch {

	public static void main(String[] args) {
	int ar[]= {1,2,3,4,5,6,7,8,9};
	int val=5;
	int index=interpolationSearch(ar,val);
  if(index==-1)
  {
	  System.out.println("Element not Found");
  }
  else
  {
	  System.out.println("Element Found at" + index);
  }
	}

	private static int interpolationSearch(int[] ar,int val) 
	{
		int h=ar.length-1;
		int l=0;
		int probe=l+(h-l)*(val-ar[l])/(ar[h]-ar[l]);
		while(val>=ar[l]&&val<=ar[h]&&l<=h)
		{
			if(ar[probe]==val) 
			{
				return probe;
			}
			else if(ar[probe]<val) 
			{
			 l=probe+1;	
			}
			else
			{
				h=probe-1;	
			}
			
		}
		return 0;
	}

}
