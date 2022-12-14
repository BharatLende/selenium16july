package Patterns;

public class Eg13_AscDesc_IncreasingDecreasing {

	public static void main(String[] args)
	{
		//*
		//**
		//***
		//****
		//*****
		//*****
		//****
		//***
		//**
		//*
		
	//rows---=9   star--=1
		
		int star=1;
		for(int i=0;i<=9;i++)
		{
			for(int j=0;j<=star;j++)
			{
				System.out.print("*");
			}
			if(i<4)
			{
				star++;
			}
			else
			{
				star--;
			}
			System.out.println();
		}

	}

}
