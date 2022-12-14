package logicalProgram;

public class ReverseTheNumberOutString {

	public static void main(String[] args) 
	{
		//1234
		int orgNumber =1234;
		int revNumber=0;
		
//		System.out.println(orgNumber/10);
//		System.out.println(orgNumber%10);
        
		for(int i=orgNumber;i>0;i=i/10) //1234 123 12 1
		{
			int rem = i%10;  //4 3 2 1  .....Reminder
			revNumber=revNumber*10+rem;
			//4=0*10+4
			//43=4*10+3
			//432=43*10+2
			//4321=432*10+1
		//System.out.println(rem);
		}
		System.out.println(revNumber);
		
		
		
	}

}
