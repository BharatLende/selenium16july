package logicalProgram;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String original = sc.next();
		String rev="";
		for(int i=original.length()-1;i>=0;i--)
		{
			char t = original.charAt(i);
			rev=rev+t;;
		}
		System.out.println("Enter the original String "+original);
		System.out.println("reverse String is "+rev);
		
		if(original.equals(rev))
		{
			System.out.println("Strng is Palindrme");
		}
		else
		{
			System.out.println("String not Palindrome");
		}
		
		
	}

}
