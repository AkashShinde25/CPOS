import java.util.Scanner;

class Q1
{
	public static void main (String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an Integer no. to check for Odd and Even");
		int n=sc.nextInt();
	
		if (n%2==0)
		{
			System.out.println("Entered no. is Even");
		}
		else
		{
			System.out.println("Entered no. is Odd");
		}	
		
	}
	
}	