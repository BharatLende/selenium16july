package logicalProgram;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args)
	{
		int a=10;
		int b=20;
		int c=a+b;
		System.err.println("sum is "+c);
		System.out.println("===========================");
		//User Input Program
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a");
		a=sc.nextInt();
		System.out.println("Enter the value of b");
		b=sc.nextInt();
		int c1=a+b;
		System.out.println("sum is "+c1);
		
		
		
		
	}

}
