package Exception;

public class TryCatchFinally {

	public static void main(String[] args)
	{
		String s=null;
		try 
		{
			System.out.println(s.charAt(3));
		}
		catch(NullPointerException e)
		{
			System.out.println("we cant work on null value ");
			
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("Plz enter value less than "+s.length());
			
		}
		finally
		{
			System.out.println("Hi god morning");
		}
		
	}

}
