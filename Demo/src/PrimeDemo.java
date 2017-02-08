import java.util.Scanner;

public class PrimeDemo {
		public static void main(String arg[])
		{
		int var1, i , flag=0;

		System.out.println("Enter the Number:");
		Scanner scan=new Scanner(System.in);
		var1=scan.nextInt();
		
		for(i=2;i<=var1/2;i++)
		{
			if(var1%i==0)
			{
			flag=1;
			break;
			}
		}

		if(flag==1)
			System.out.println("It is not a prime Number");
		else
			System.out.println("It is a prime Number");
		}
	}


