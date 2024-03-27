package coding;

public class Quick_Sort_Double {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double arr[]= {0.5,0.7,0.2,0.9,0.1,0.4,0.3};
		quicksort(arr,0,arr.length-1);
		for(double a: arr)
		
		{
					System.out.print(a+" ");
	}
	}

	private static void quicksort(double[] arr, int start, int end) {
		// TODO Auto-generated method stub
		if(end<=start)
			return ;
		int pivot=partition(arr,start,end);
		quicksort(arr,start,pivot-1);
		quicksort(arr,pivot+1,end);
		
	}

	private static int partition(double[] arr, int start, int end) {
		double pivot=arr[end];
		int i=start-1;
		for(int j=start;j<=end;j++)
		{
			if(arr[j]<pivot)
			{
				i++;
				double temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		i++;
		double temp=arr[i];
		arr[i]=arr[end];
		arr[end]=temp;
		return i;


	}

}
