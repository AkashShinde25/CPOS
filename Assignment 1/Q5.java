import java.util.Scanner;

class Q5
{
	public static void main (String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a No.:");
		int a=s.nextInt();
		
		if(a==0)
		{
			System.out.println("Entered No. is Zero");
		}			
		else if(a>0)
		{
			System.out.println("Entered No. is Positive");
		}
		else
		{
			System.out.println("Entered No. is Negative");
		}	
		
	}
	
}	