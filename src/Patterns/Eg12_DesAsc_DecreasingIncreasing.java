package Patterns;

public class Eg12_DesAsc_DecreasingIncreasing {

	public static void main(String[] args)
	{
		//*****
		//****
		//***
		//**
		//*
		//**
		//***
		//****
		//*****
	 //rows---=9;  star--=5 
		
		int star=5;
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");
			}
			if(i<5)
			{
				star--;
			}
			else
			{
				star++;
			}
			System.out.println();
			
		}
	}

}
