package sample2;

import java.util.Scanner;

public class Test {
	void numbers()
	{
		char[]x=new char[4];
		for(int i=0;i<8;i++)
		{
			Scanner obj2=new Scanner(System.in);
			x[i]=obj2.next().charAt(0);
			
		}
		System.out.println("x");
		for(int i=0;i<4;i++)
		{
			if(!Character.isLetter(x[i]))
			{
				System.out.println("numbers are found");
				break;
				
			}
			else{
				System.out.println("the numbers in the word are not found");
				break;
			}
		
		}
	}
	public static void main(String[] args)
	{
		System.out.println("enter the words:");
		Test b=new Test();
		b.numbers();
		
			
	}

}
