package Patterns;

public class Eg11 {

	public static void main(String[] args)
	{
		//*         *        Sapce= from star four space + one(Middle space) so thats why written space1=5
		//**       **
        //***     ***        after middle space there are 4 space space2=4
		//****   ****
		//***** *****    if between this there is no space then space1=4 and space2=4
		//****   ****
		//***     ***
		//**       **
		//*         *
	
		//rows=9; 
		
		//star1=1   //Star on the first row left
		//space1=5  //space on the first row left
		//space2=4  //star onthe first row Right
		//star2=1   //space2 on the first row Right
		int star1=1;
		int space1=5;
		int space2=4;
		int star2=1;
		
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=star1;j++)
			{
				System.out.print("*");
				
			}
			for(int k=1;k<=space1;k++)
			{
				System.out.print(" ");
			}
			for(int l=1;l<=space2;l++)
			{
				System.out.print(" ");
			}
			for(int m=1;m<=star2;m++)
			{
				System.out.print("*");
			}
			
			if(i<5)
			{
				star1++;
				space1--;
				star2++;
				space2--;
			}
			else
			{
				star1--;
				space1++;
				star2--;
				space2++;
			}
			System.out.println();
				
		}
	}

}
