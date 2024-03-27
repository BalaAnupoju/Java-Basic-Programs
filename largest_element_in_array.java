package preparation;

public class largest_element_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int temp=0;
	       int[] a= {10,47,20,5,17,58,7,24};
	       for(int i=0;i<a.length;i++)
	       {
	    	   for(int j=i+1;j<a.length;j++)
	    	   {
	    	   if(a[i]>a[j])
	    	   {
	    		   temp=a[i];
	    		   a[i]=a[j];
	    		   a[j]=temp;
	    	   }
	       }
	       System.out.println(a[i]);
	      
	}
	      // int n=a.length;
	       System.out.println(a[a.length-1]);
	}
}
