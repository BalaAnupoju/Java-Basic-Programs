package tasks;

public class npe_task10 {

	public static void main(String[] args) throws Exception {
			
			//Throw Exception
			//-----------------------------------------------------------------------
			
			String [] s=null;
			//System.out.println(s);
			//System.out.println(s.length);
			//using of try and catch
			//-----------------------------------------------------------------------
			
			try
			{
				System.out.println("try block");
				System.out.println(s.length);
			}
				
				
			catch(Exception e)
			{
			//System.out.println(e.getMessage());
			//e.printStackTrace();
			}
			finally
			{
				System.out.println("Exception "
						+ "catched");
			}

	}

}
