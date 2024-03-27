package coding;

public class Quick_Sort_char {

	public static void main(String[] args) {
		char arr[]= {'b','z','d','v','w','q','s','a','T','I'};
		quicksort(arr,0,arr.length-1);
		for(char a: arr)
		{
					System.out.print(a+" ");
	}
	}

	private static void quicksort(char[] arr, int start, int end) {
		// TODO Auto-generated method stub
		if(end<=start)
			return ;
		int pivot=partition(arr,start,end);
		quicksort(arr,start,pivot-1);
		quicksort(arr,pivot+1,end);
		
	}

	private static int partition(char[] arr, int start, int end) {
		int pivot=arr[end];
		int i=start-1;
		for(int j=start;j<=end;j++)
		{
			if(arr[j]<pivot)
			{
				i++;
				char temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		i++;
		char temp=arr[i];
		arr[i]=arr[end];
		arr[end]=temp;
		return i;
	}

}
