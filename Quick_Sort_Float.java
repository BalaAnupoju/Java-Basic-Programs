package coding;

public class Quick_Sort_Float {

	public static void main(String[] args) {
		float arr[]= {0.1f,1.2f,0.4f,2.2f};
		quicksort(arr,0,arr.length-1);
		for(double a: arr)
		
		{
					System.out.print(a+" ");
	}
	}

	private static void quicksort(float[] arr, int start, int end) {
		// TODO Auto-generated method stub
		if(end<=start)
			return ;
		int pivot=partition(arr,start,end);
		quicksort(arr,start,pivot-1);
		quicksort(arr,pivot+1,end);
		
	}

	private static int partition(float[] arr, int start, int end) {
		double pivot=arr[end];
		int i=start-1;
		for(int j=start;j<=end;j++)
		{
			if(arr[j]<pivot)
			{
				i++;
				float temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		i++;
		float temp=arr[i];
		arr[i]=arr[end];
		arr[end]=temp;
		return i;
	}

}
