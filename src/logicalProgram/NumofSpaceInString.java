package logicalProgram;

public class NumofSpaceInString {

	public static void main(String[] args) 
	{
		String a="P u  ne";
		int count=0;
		
		for(int i=0;i<=a.length()-1;i++)
		{
			char t = a.charAt(i);
			char space=' ';
			if(t==space)
			{
				count++;
			}
		}
		System.out.println("Number of blank space are "+count);
		
	}

}
